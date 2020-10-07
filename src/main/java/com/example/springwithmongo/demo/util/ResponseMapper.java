package com.example.springwithmongo.demo.util;

import com.example.springwithmongo.demo.dto.HotelListResponseDTO;
import com.example.springwithmongo.demo.models.Hotel;

import java.util.ArrayList;
import java.util.List;

public class ResponseMapper {
    public static HotelListResponseDTO successListOfHotelResponse(List<Hotel> hotels) {
        return new HotelListResponseDTO()
                .setCount(hotels.size())
                .setResponseCode(200)
                .setResponseMessage("Response deliver Success!")
                .setResults(hotels);
    }

    public static HotelListResponseDTO errorListOfHotelResponse(String message) {
        return new HotelListResponseDTO()
                .setCount(0)
                .setResponseCode(401)
                .setResponseMessage(message)
                .setResults(new ArrayList<>());
    }
}
