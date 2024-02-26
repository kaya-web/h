package com.hotelproject.hoteldetails.model;

public class HotelMenu
{
    private String Item;
    private String Price;

    public HotelMenu()
    {
    }

    public HotelMenu(String item, String price) {
        Item = item;
        Price = price;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String item) {
        Item = item;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
