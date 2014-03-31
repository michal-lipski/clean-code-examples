package com.solid.refactor.openclosed.third;

public class Movie {

    String title;
    private Price price;

    public Movie(String title, Price price) {
        this.title = title;
        this.price = price;
    }

    public double getCharge(int daysRented) {
        return price.getPrice(daysRented);
    }

}
