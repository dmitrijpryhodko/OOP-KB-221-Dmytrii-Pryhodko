package lab01;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Загальна сума платежу: ");
        float a = scanner.nextFloat();

        System.out.println("Кількість друзів: ");
        int b = scanner.nextInt();


        if (a <= 0 && b <= 0) {
            System.out.println("Неправильне значення");
        } else {
            double c = a / b;
            double d = ((a * 10) / 100) / b;
            double res = c + d;


            System.out.printf("Сума з кожної людини на чайові: %.2f%n", d);
            System.out.printf("Частина оплати: %.2f%n", res);
        }
    }
}
