package lab01;


import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість незнайомців:");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Неприпустима кількість незнайомців.");
            return;
        }

        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println("Введіть ім'я незнайомця " + (i + 1) + ":");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name);
        }
    }
}
