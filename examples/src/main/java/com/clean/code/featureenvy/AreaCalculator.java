package com.clean.code.featureenvy;

public class AreaCalculator {

    public double sumAreas(Rectangle[] rectangles) {
        double totalArea = 0;
        for (Rectangle rectangle : rectangles) {
            totalArea += rectangle.width * rectangle.height;
        }
        return totalArea;
    }

    public class Rectangle{
        double width;
        double height;
    }

}
