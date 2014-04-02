package com.clean.code.functions;

public class ArgumentObjects {


    void createACircle() {
        Point center = new Point(10, 20);
        Circle.make(center, 15);
    }


    static class Circle {

        private Circle(double x, double y, double radius) {
        }

        public static void make(Point point, int radius) {

        }
    }

    private class Point {
        public Point(int x, int y) {
        }
    }
}
