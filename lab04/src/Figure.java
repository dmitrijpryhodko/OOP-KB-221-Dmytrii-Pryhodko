abstract class Figure {
    protected double area;
    protected Point centroid;

    public double getArea() {

        return area;
    }

    public Point getCentroid() {

        return centroid;
    }

    abstract double calculateArea();
    abstract Point calculateCentroid();

    public abstract double area();

    public abstract Point centroid();
}

class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {

        return x;
    }
    public double getY() {

        return y;
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    public double distanceTo(Point B) {

        return 0;
    }
}

class MyPoint {
    private double x;
    private double y;
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {

        return x;
    }
    public double getY() {

        return y;
    }
    public double distanceTo(MyPoint other) {
        return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

