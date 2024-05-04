package sphere;

import java.text.DecimalFormat;

class Sphere {
    private double diameter;

    // Constructor to accept and initialize the diameter
    public Sphere(double diameter) {
        this.diameter = diameter;
    }

    // Getter for diameter
    public double getDiameter() {
        return diameter;
    }

    // Setter for diameter
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    // Method to calculate and return the volume of the sphere
    public double calculateVolume() {
        double radius = diameter / 2.0;
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Method to calculate and return the surface area of the sphere
    public double calculateSurfaceArea() {
        double radius = diameter / 2.0;
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    // toString method to return a one-line description of the sphere
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Sphere with diameter " + df.format(diameter);
    }
}
