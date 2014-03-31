package com.solid.refactor.moviesbefore;

public class ChildrenMoviePrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.CHILDREN;
    }

    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}
