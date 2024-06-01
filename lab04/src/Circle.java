public class Circle extends Figure {
    private Point center;
    private double radius;
    public Circle(Point center, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радіус повинен бути додатнім");
        }
        this.center = center;
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return 0;
    }

    @Override
    Point calculateCentroid() {
        return null;
    }

    @Override
    public double area() {
        return 2 * Math.PI * radius;
    }

    @Override
    public Point centroid() {

        return center; // Центр кола вважається його центроїдом
    }
    @Override
    public String toString() {
        return "Радіус кола " + radius + "\n" +
                "Довжина кола: " + String.format("%.2f", area()) + "\n" + "Центроїд: " + centroid();

    }
    public static void main(String[] args) {

        Point center = new Point(1, 1); //координати центра кола
        double radius = 5;
        Circle circle = new Circle(center, radius) {
            @Override
            double calculateArea() {

                return 0;
            }

            @Override
            Point calculateCentroid() {

                return null;
            }
        };
    }
}
