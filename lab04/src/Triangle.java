public class Triangle extends Figure {
    private MyPoint A;
    private MyPoint B;
    private MyPoint C;

    public Triangle(MyPoint A, MyPoint B, MyPoint C) {
        if (areVerticesCollinear(A, B, C)) {
            throw new IllegalArgumentException("Трикутник не може бути виродженим");
        }

        this.A = A;
        this.B = B;
        this.C = C;
    }

    @Override
    double calculateArea() {

        return 0;
    }

    @Override
    Point calculateCentroid() {

        return null;
    }

    public double area() {
        double side1 = A.distanceTo(B);
        double side2 = B.distanceTo(C);
        double side3 = C.distanceTo(A);
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public Point centroid() {
        double centroidX = (A.getX() + B.getX() + C.getX()) / 3;
        double centroidY = (A.getY() + B.getY() + C.getY()) / 3;
        return new Point(centroidX, centroidY);
    }

    private boolean areVerticesCollinear(MyPoint p1, MyPoint p2, MyPoint p3) {
        return Math.abs((p2.getY() - p1.getY()) * (p3.getX() - p2.getX()) -
                (p3.getY() - p2.getY()) * (p2.getX() - p1.getX())) < 1e-6;

    }
}



