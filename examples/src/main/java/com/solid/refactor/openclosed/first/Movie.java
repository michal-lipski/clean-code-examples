package com.solid.refactor.openclosed.first;

public class Movie {
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    String title;
    int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public double getCharge(int daysRented) {
        if (priceCode == REGULAR) {
            double result = 2;
            if (daysRented > 2)
                result += (daysRented - 2) * 1.5;
            return result;
        } else if (priceCode == NEW_RELEASE) {
            return daysRented * 3;
        } else {
            throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

}
