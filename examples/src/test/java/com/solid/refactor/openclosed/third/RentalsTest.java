package com.solid.refactor.openclosed.third;


import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RentalsTest {

    @Test
    public void calculate_total_charge_for_rentals() throws Exception {
        Rentals rentals = new Rentals();
        Movie regularMovie = new Movie("Matrix", new RegularPrice());
        Movie newReleaseMovie = new Movie("Shrek", new NewReleasePrice());
        Movie childMovie = new Movie("Lion king", new ChildPrice());

        rentals.add(new Rental(newReleaseMovie, 2));
        rentals.add(new Rental(regularMovie, 3));
        rentals.add(new Rental(childMovie, 1));

        Assertions.assertThat(rentals.getTotalCharge()).isEqualTo(11.5);
    }

    private class ChildPrice implements Price {
        @Override
        public double getPrice(int daysRented) {
            return daysRented * 2;
        }
    }
}
