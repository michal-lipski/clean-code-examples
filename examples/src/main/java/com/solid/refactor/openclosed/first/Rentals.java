package com.solid.refactor.openclosed.first;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Rentals implements Iterable<Rental> {
    private List<Rental> rentalList = new ArrayList<Rental>();

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


}