package com.solid.refactor.movies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Rentals implements Iterable<Rental> {
    List<Rental> rentalList = new ArrayList<Rental>();

    public Rentals() {
    }

    public void add(Rental rental) {
        rentalList.add(rental);
    }

    public double getTotalCharge() {
        double totalCharge = 0;
        for (Rental rental : rentalList) {
            totalCharge += rental.getCharge();
        }
        return totalCharge;
    }

    @Override
    public Iterator<Rental> iterator() {
        return rentalList.iterator();
    }

    public String getDescription() {
        String description = "";
        for (Rental rental : rentalList) {
            description += rental.rentalDescription() + "\n";
        }
        return description;
    }

    public int getFrequentRenterPoints() {
        int totalPoints = 0;
        for (Rental rental : rentalList) {
            totalPoints = rental.getFrequentRenterPoints();
        }
        return totalPoints;
    }
}