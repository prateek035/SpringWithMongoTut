package com.example.springwithmongo.demo.service;

import com.example.springwithmongo.demo.models.Hotel;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface HotelService {

    void addHotel(Hotel hotel);

    List<Hotel> getAllHotel();

    void updateHotel(Hotel hotel);

    void deleteHotel(String id);

    Optional<Hotel> getHotelById(String id);

    List<Hotel> getHotelByCity(String city, int pageNo, int size);

    List<Hotel> getHotelByCountry(String country, int pageNo, int size);

    List<Hotel> getHotelByPricePerNight(int maxPrice);


}
