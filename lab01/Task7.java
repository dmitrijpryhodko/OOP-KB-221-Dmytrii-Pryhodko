package lab01;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.MIN_VALUE;

        System.out.println("Введіть послідовність цілих чисел (нуль для завершення):");

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number > a) {
                a = number;
            }
        }

        System.out.println("Результат: " + a);
    }
}

