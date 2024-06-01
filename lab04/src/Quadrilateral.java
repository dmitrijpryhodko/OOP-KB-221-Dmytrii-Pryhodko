public class Quadrilateral extends Figure {
    private MyPoint A;
    private MyPoint B;
    private MyPoint C;
    private MyPoint D;

    public Quadrilateral(MyPoint A, MyPoint B, MyPoint C, MyPoint D) {
        if (areVerticesCollinear(A, B, C, D)) {
            throw new IllegalArgumentException("Чотирикутник не може бути виродженим");
        }

        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    @Override
    Point calculateCentroid() {

        double centroidX = (A.getX() + B.getX() + C.getX() + D.getX()) / 4;
        double centroidY = (A.getY() + B.getY() + C.getY() + D.getY()) / 4;
        return new Point(centroidX, centroidY);
    }

    @Override
    public double area() {

        return 0;
    }

    @Override
    double calculateArea() {
        double area = 0.5 * Math.abs((A.getX() - C.getX()) * (B.getY() - D.getY()) -
                (B.getX() - D.getX()) * (A.getY() - C.getY()));
        return area;
    }
    @Override
    public Point centroid() {

        return null;
    }

    private boolean areVerticesCollinear(MyPoint p1, MyPoint p2, MyPoint p3, MyPoint p4) {
        return Math.abs((p2.getY() - p1.getY()) * (p3.getX() - p2.getX()) -
                (p3.getY() - p2.getY()) * (p2.getX() - p1.getX())) < 1e-6 &&
                Math.abs((p3.getY() - p2.getY()) * (p4.getX() - p3.getX()) -
                        (p4.getY() - p3.getY()) * (p3.getX() - p2.getX())) < 1e-6;
    }
}


