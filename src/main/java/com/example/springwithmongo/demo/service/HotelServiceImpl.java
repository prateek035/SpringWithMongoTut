package com.example.springwithmongo.demo.service;

import com.example.springwithmongo.demo.models.Hotel;
import com.example.springwithmongo.demo.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AbstractPageRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<Hotel> getHotelByCity(String city, int pageNo, int size) {
        try {
            return hotelRepository.findByCity(city,  PageRequest.of(pageNo, size)).getContent();
        }catch(IllegalArgumentException e) {
            return new ArrayList<>();
        }
    }

    @Override
    public List<Hotel> getHotelByCountry(String country, int pageNo, int size) {
        try{
            return hotelRepository.findByCountry(country, PageRequest.of(pageNo, size)).getContent();
        }catch(IllegalArgumentException e) {
            return new ArrayList<>();
        }
    }

    @Override
    public List<Hotel> getHotelByPricePerNight(int maxPrice) {
        return hotelRepository.findByPricePerNightLessThan(maxPrice);
    }
}
