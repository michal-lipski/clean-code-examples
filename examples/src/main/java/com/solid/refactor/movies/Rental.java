package com.solid.refactor.movies;

class Rental {
    Movie movie;
    int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public double getCharge() {
        return movie.getCharge(daysRented);
    }

    public String getMovieTitle() {
        return movie.getTitle();
    }

    String rentalDescription() {
        return getMovieTitle() + " " + getCharge();
    }

    public int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(daysRented);
    }
}
