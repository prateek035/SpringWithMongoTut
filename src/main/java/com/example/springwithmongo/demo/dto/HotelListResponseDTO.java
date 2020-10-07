package com.example.springwithmongo.demo.dto;


import com.example.springwithmongo.demo.models.Hotel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class HotelListResponseDTO {
    private int responseCode;
    private String responseMessage;
    private int count;
    List<Hotel> results;
}
