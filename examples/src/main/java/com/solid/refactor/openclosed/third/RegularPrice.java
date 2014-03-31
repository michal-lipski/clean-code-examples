package com.solid.refactor.openclosed.third;

/**
 * Created by mlip on 3/30/14.
 */
public class RegularPrice implements Price{
    @Override
    public double getPrice(int daysRented) {
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;
        return result;
    }
}
