package com.example.springwithmongo.demo.service;

import com.example.springwithmongo.demo.dto.HotelListResponseDTO;
import com.example.springwithmongo.demo.models.Hotel;

import java.util.List;
import java.util.Optional;

public interface HotelService {

    void addHotel(Hotel hotel);

    List<Hotel> getAllHotel();

    void updateHotel(Hotel hotel);

    void deleteHotel(String id);

    Optional<Hotel> getHotelById(String id);

    HotelListResponseDTO getHotelByCity(String city, int pageNo, int size);

    HotelListResponseDTO getHotelByCountry(String country, int pageNo, int size);

    List<Hotel> getHotelByPricePerNight(int maxPrice);


}
