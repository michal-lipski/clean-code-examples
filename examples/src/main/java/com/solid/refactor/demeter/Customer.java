package com.solid.refactor.demeter;

class Customer {

    private Rentals rentals = new Rentals();
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public double getTotalCharge() {
        double totalCharge = 0;

        for (Rental rental : rentals.rentalList) {
            totalCharge += rental.movie.price.getCharge(rental.daysRented);
        }

        return totalCharge;
    }

}
