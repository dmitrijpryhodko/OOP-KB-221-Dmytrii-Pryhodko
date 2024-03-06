package lab01;


import java.util.Scanner;

public class Task3 {
    private static final int password = 987654321;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть пароль:");
        int enteredPassword = scanner.nextInt();

        if (enteredPassword == password) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}

