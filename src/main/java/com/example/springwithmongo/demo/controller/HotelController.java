package com.example.springwithmongo.demo.controller;

import com.example.springwithmongo.demo.models.Hotel;
import com.example.springwithmongo.demo.service.HotelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hotels")
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

    @DeleteMapping("/{id}")
    public void deleteHotel(@PathVariable("id") String id) {
        hotelService.deleteHotel(id);
    }

    @GetMapping("/{id}")
    public Optional<Hotel> getHotelById(@PathVariable("id") String id) {
        return hotelService.getHotelById(id);
    }

    @GetMapping("/price/{maxPrice}")
    public List<Hotel> getHotelByPricePerNight(@PathVariable("maxPrice") int maxPrice) {
        return hotelService.getHotelByPricePerNight(maxPrice);
    }

    @GetMapping("/address/city/{city}")
    public List<Hotel> getHotelByCity(@PathVariable("city") String city) {
        return hotelService.getHotelByCity(city);
    }

    @GetMapping("/address/country/{country}")
    public List<Hotel> getHotelByCountry(@PathVariable("country") String country) {
        return hotelService.getHotelByCountry(country);
    }
}
