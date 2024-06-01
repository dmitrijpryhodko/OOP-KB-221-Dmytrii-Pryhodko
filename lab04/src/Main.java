public class Main {
    public static void main(String[] args) {
        MyPoint A = new MyPoint(1, 7);
        MyPoint B = new MyPoint(1, 4);
        MyPoint C = new MyPoint(2, 6);
        Triangle triangle = new Triangle(A, B, C);

        System.out.printf("Площа трикутника: %.2f%n", triangle.area());
        System.out.println("Центроїд трикутника: " + triangle.centroid());


        A = new MyPoint(1, 7);
        B = new MyPoint(10, 8);
        C = new MyPoint(1, 3);
        MyPoint D = new MyPoint(6, 8);
        Quadrilateral quadrilateral = new Quadrilateral(A, B, C, D);

        System.out.printf("Площа чотирикутника: %.2f%n" , quadrilateral.calculateArea());
        System.out.println("Центроїд чотирикутника: " + quadrilateral.calculateCentroid());


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
        System.out.println(circle);
    }
}

