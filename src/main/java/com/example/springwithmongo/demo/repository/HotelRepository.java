package com.example.springwithmongo.demo.repository;

import com.example.springwithmongo.demo.models.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HotelRepository extends MongoRepository<Hotel, String> {


//    Optional<Hotel> findById(String id);

    List<Hotel> findByPricePerNightLessThan(int maxPrice);

    @Query(value = "{'address.city':?0}")
    List<Hotel> findByCity (String city);

    @Query(value = "{'address.country':?0}")
    List<Hotel> findByCountry(String country);
}
