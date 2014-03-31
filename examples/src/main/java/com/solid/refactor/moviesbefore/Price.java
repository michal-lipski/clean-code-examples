package com.solid.refactor.moviesbefore;

public abstract class Price {
    int frequentRenterPoints;
    public abstract int getPriceCode();

    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }

    public int getFrequentRenterPoints(int daysRented) {
        frequentRenterPoints = 1;
        calculateBonus(daysRented);
        return frequentRenterPoints;
    }

    private void calculateBonus(int daysRented) {
        if ((this.getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1) {
            frequentRenterPoints ++;
        }
    }
}
