package com.solid.refactor.moviesbefore;


class Customer {

    private Rentals rentals = new Rentals();
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String rentalsSummary() {
        SummaryReport sum = new SummaryReport();

        sum.add("Rental Record for " + name + "\n");
        String d = "";
        for (Rental rental : rentals.rentalList) {
            d += rental.getMovieTitle() + " " + rental.movie.price.getCharge(rental.daysRented) + "\n";
        }
        sum.add(d);
        double totalCharge = 0;
        for (Rental rental : rentals.rentalList) {
            double sum2 = 1.5;
            if (rental.daysRented > 3)
                sum2 += (rental.daysRented - 3) * 1.5;
            totalCharge += sum2;
        }
        sum.add("Amount owed is " + totalCharge + "\n");

        return sum.asString();
    }

}
