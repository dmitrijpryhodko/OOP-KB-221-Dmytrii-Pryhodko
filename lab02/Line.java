package lab02;

import java.util.Scanner;

public class Line {
    double k, b;

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        if (this.k == other.k && this.b != other.b) {
            return null;
        } else if (this.k == other.k && this.b == other.b) {
            return null;
        } else {
            double x = (other.b - this.b) / (this.k - other.k);
            double y = this.k * x + this.b;
            return new Point(x, y);
        }
    }

    static class Point {
        double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "(" + x + "; " + y + ")";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть координати першої лінії (k та b): ");
        double k1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        Line line1 = new Line(k1, b1);

        System.out.println("Введіть координати другої лінії (k та b): ");
        double k2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        Line line2 = new Line(k2, b2);
        System.out.println(line1.intersection(line2));
    }
}



