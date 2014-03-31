package com.solid.refactor.moviesbefore;

public class CustomerRentalsSummary {

    public String rentalsSummary(Rentals rentals, String customerName) {
        SummaryReport summary = new SummaryReport();

        summary.add(headerLine(customerName));
        summary.add(rentalsDescriptions(rentals));
        summary.add(footerLine(rentals));

        return summary.asString();
    }

    String headerLine(String customerName) {
        return "Rental Record for " + customerName + "\n";
    }

    String rentalsDescriptions(Rentals rentals) {
        return rentals.getDescription();
    }

    String footerLine(Rentals rentals) {
        return "Amount owed is " + rentals.getTotalCharge() + "\n";
    }

}
