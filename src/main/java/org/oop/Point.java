package org.oop;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceFromAnotherPoint(Point secondPoint) {
        double xDistance = this.getX() - secondPoint.getX();
        double yDistance = this.getY() - secondPoint.getY();
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));

    }

    public double directionToAnotherPoint(Point secondPoint) {
        double xDistance = this.getX() - secondPoint.getX();
        double yDistance = this.getY() - secondPoint.getY();
        return Math.atan2(yDistance, xDistance);
    }


}
