package com.example.azreviewlea.service;

import com.example.azreviewlea.dto.Hotel;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MainService {
//    private final HotelRepo hotelRepo;
//
//    public void addLike(Integer id) {
//        var hotel = hotelRepo.findById(id).get();
//        var rate = hotel.getRate();
//        hotel.setRate(rate + 1);
//        hotelRepo.save(hotel);
//    }

    public List<Hotel> rank(){
        List<Hotel> list = new ArrayList<>();
        list.add(new Hotel(1, "Bla", 21));
        list.add(new Hotel(2, "OPa", 10));
        list.add(new Hotel(3, "Pao", 12));
        list.add(new Hotel(4, "Pio", 14));
        list.add(new Hotel(5, "Opio", 18));
//        return hotelRepo.findAll();
        return list;
    }
}
