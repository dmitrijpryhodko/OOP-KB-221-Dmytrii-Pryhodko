package lab01;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть значення а:");
        int a = scanner.nextInt();

        System.out.println("Введіть значення b:");
        int b = scanner.nextInt();

        System.out.println("Введіть значення h:");
        int h = scanner.nextInt();


        if (a <= 0 || b <= 0 || h <= 0) {
            System.out.println("Неправильне значення");
        } else if (a >= h || a <= b) {
            System.out.println("Impossible");
        } else {
            int days = (h - b - 1) / (a - b) + 1;
            System.out.println(days);

        }


    }
 }


