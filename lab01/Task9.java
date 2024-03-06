package lab01;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть значення a: ");
        double a = scanner.nextDouble();
        System.out.println("Введіть значення b: ");
        double b = scanner.nextDouble();
        System.out.println("Введіть значення c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Два різних корені: x1 = %.2f, x2 = %.2f", x1, x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.printf("Один подвійний корінь: x = %.2f", x);
        } else {
            System.out.println("Коренів немає, дискримінант менше нуля.");

        }
    }
}

