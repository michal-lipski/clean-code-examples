package com.solid.refactor.openclosed.second;

public class Movie {
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDREN = 2;

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

        } else if (priceCode == CHILDREN) {
            return daysRented * 2;
        } else {
            throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

}
