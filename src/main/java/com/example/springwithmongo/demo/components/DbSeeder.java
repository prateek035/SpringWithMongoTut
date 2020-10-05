//package com.example.springwithmongo.demo.components;
//
//import com.example.springwithmongo.demo.models.Address;
//import com.example.springwithmongo.demo.models.Hotel;
//import com.example.springwithmongo.demo.models.Review;
//import com.example.springwithmongo.demo.repository.HotelRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//@Component
//public class DbSeeder implements CommandLineRunner {
//
//    private HotelRepository hotelRepository;
//
//    public DbSeeder(HotelRepository hotelRepository) {
//        this.hotelRepository = hotelRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Hotel marriot = new Hotel(
//                "Marriot",
//                130,
//                new Address("Paris", "France"),
//                Arrays.asList(
//                        new Review("Jon",8,false),
//                        new Review("Ben",7,true),
//                        new Review("Mark",4,false)
//                        ));
//
//        Hotel ibis = new Hotel(
//                "Ibis",
//                150,
//                new Address("Delhi", "India"),
//                Arrays.asList(
//                        new Review("Ted",8,false),
//                        new Review("Ben",7,true),
//                        new Review("Kat",9,true)
//                ));
//
//        Hotel classico = new Hotel(
//                "Classico",
//                80,
//                new Address("Rome", "Italy"),
//                new ArrayList<>()
//                );
//
//        // drop all hotels
//        this.hotelRepository.deleteAll();
//
//        // add our hotels to the database
//        List<Hotel> hotels = Arrays.asList(marriot,ibis,classico);
//        this.hotelRepository.saveAll(hotels);
//    }
//}
