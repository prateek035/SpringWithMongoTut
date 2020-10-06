package com.example.springwithmongo.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@Data
@Document("Reviews")
public class Review {

    @Id
    private String id;
    private String userName;
    private double rating;
    private boolean approved;
    private String hotelId;

    public Review(String userName, double rating, boolean approved, String hotelId) {
        this.approved = approved;
        this.hotelId = hotelId;
        this.rating = rating;
        this.userName = userName;
    }

}
