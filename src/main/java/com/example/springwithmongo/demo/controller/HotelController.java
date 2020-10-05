package com.example.springwithmongo.demo.controller;

import com.example.springwithmongo.demo.models.Hotel;
import com.example.springwithmongo.demo.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    private HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/all")
    public List<Hotel> getAllHotel() {
        return this.hotelRepository.findAll();
    }

    @PutMapping
    public void insertHotel(@RequestBody Hotel hotel) {
        // save will also serve the purpose
        this.hotelRepository.insert(hotel);
    }

    @PostMapping
    public void updateHotel(@RequestBody Hotel hotel) {
        // save can perform insert and update both ..
        this.hotelRepository.save(hotel);
    }

    @DeleteMapping("/{id}")
    public void deleteHotel(@PathVariable("id") String id) {
        this.hotelRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Hotel> getHotelById(@PathVariable("id") String id) {
        return this.hotelRepository.findById(id);
    }

    @GetMapping("/price/{maxPrice}")
    public List<Hotel> getHotelByPricePerNight(@PathVariable("maxPrice") int maxPrice) {
        return this.hotelRepository.findByPricePerNightLessThan(maxPrice);
    }

    @GetMapping("/address/city/{city}")
    public List<Hotel> getHotelByCity(@PathVariable("city") String city) {
        return this.hotelRepository.findByCity(city);
    }

    @GetMapping("/address/country/{country}")
    public List<Hotel> getHotelByCountry(@PathVariable("country") String country) {
        return this.hotelRepository.findByCountry(country);
    }
}
