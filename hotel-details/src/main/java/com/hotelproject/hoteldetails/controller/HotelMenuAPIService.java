package com.hotelproject.hoteldetails.controller;

import com.hotelproject.hoteldetails.model.HotelMenu;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotel")

public class HotelMenuAPIService
{
    HotelMenu hotelMenu;

    @GetMapping("{price}")
    public HotelMenu getHotelMenuDetails(String price)
    {
//        return hotelMenu;
        return new HotelMenu("palak","900");
   }

    @PostMapping
    public String createHotelMenuDetails(@RequestBody HotelMenu hotelMenu)
    {
        this.hotelMenu=hotelMenu;
        return "hotel menu posted succefully";
    }
}
