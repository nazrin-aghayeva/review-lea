package com.example.azreviewlea.service;

import com.example.azreviewlea.dto.Hotel;
import com.example.azreviewlea.repository.HotelRepo;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MainService {
    private final HotelRepo hotelRepo;

    public void addLike(Integer id) {
        var hotel = hotelRepo.findById(id).get();
        var rate = hotel.getRate();
        hotel.setRate(rate + 1);
        hotelRepo.save(hotel);
    }

    public List<Hotel> rank(){
        return hotelRepo.findAll();
    }
}
