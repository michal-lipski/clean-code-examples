package com.solid.refactor.demeter;

class Rental {
    Movie movie;
    int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }


}
