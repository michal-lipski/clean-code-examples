package com.solid.refactor.openclosed.third;

public class NewReleasePrice implements Price{

    public double getPrice(int daysRented) {
        return daysRented * 3;
    }
}