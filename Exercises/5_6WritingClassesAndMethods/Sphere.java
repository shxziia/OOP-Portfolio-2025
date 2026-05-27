public class Sphere {

    private double radius;
    private double diameter;


    public Sphere(double radius) {
        this.radius = radius;
        this.diameter = 2 * radius;

    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.diameter = 2 * radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
        this.radius = diameter / 2;
    }

    public double calculateSurfacearea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double calculateVolume() {
       return (4.0/3.0)* Math.PI * Math.pow(radius, 3);
    }

}

