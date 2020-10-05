package com.example.springwithmongo.demo.service;

import com.example.springwithmongo.demo.models.Hotel;
import com.example.springwithmongo.demo.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    HotelRepository hotelRepository;


    @Override
    public void addHotel(Hotel hotel) {
        hotelRepository.insert(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepository.findAll();
    }

    @Override
    public void updateHotel(Hotel hotel) {
        hotelRepository.save(hotel);
    }

    @Override
    public void deleteHotel(String id) {
        hotelRepository.deleteById(id);
    }

    @Override
    public Optional<Hotel> getHotelById(String id) {
        return hotelRepository.findById(id);
    }

    @Override
    public List<Hotel> getHotelByCity(String city) {
        return hotelRepository.findByCity(city);
    }

    @Override
    public List<Hotel> getHotelByCountry(String country) {
        return hotelRepository.findByCountry(country);
    }

    @Override
    public List<Hotel> getHotelByPricePerNight(int maxPrice) {
        return hotelRepository.findByPricePerNightLessThan(maxPrice);
    }
}
