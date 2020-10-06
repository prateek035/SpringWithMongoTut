package com.example.springwithmongo.demo.controller;

import com.example.springwithmongo.demo.models.Hotel;
import com.example.springwithmongo.demo.service.HotelService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {

    private HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/all")
    public List<Hotel> getAllHotel() {
        return hotelService.getAllHotel();
    }

    @PutMapping
    public void insertHotel(@RequestBody Hotel hotel) {
        // save will also serve the purpose
        hotelService.addHotel(hotel);
    }

    @PostMapping
    public void updateHotel(@RequestBody Hotel hotel) {
        // save can perform insert and update both ..
        hotelService.updateHotel(hotel);
    }

    @DeleteMapping("/id/{id}")
    public void deleteHotel(@PathVariable("id") String id) {
        hotelService.deleteHotel(id);
    }

    @GetMapping("/id/{id}")
    public Optional<Hotel> getHotelById(@PathVariable("id") String id) {
        return hotelService.getHotelById(id);
    }

    @GetMapping("/price/{maxPrice}")
    public List<Hotel> getHotelByPricePerNight(@PathVariable("maxPrice") int maxPrice) {
        return hotelService.getHotelByPricePerNight(maxPrice);
    }

    @GetMapping(path = "/address/city/{city}", params = {"pageNo","size"})
    public List<Hotel> getHotelByCity(@PathVariable("city") String city, @RequestParam("pageNo") int pageNo,
                                      @RequestParam("size") int size) {
        return hotelService.getHotelByCity(city, pageNo, size);
    }

    @GetMapping(path = "/address/country/{country}", params = {"pageNo","size"})
    public List<Hotel> getHotelByCountry(@PathVariable("country") String country, @RequestParam("pageNo") int pageNo,
                                         @RequestParam("size") int size) {
        return hotelService.getHotelByCountry(country, pageNo, size);
    }
}
