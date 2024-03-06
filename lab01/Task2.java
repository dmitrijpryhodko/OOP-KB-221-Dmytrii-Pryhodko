package lab01;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість секунд, що пройшли з півночі:");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        String formattedTime = String.format("%d:%02d:%02d", hours, minutes, seconds);

        System.out.println("Електронний годинник: " + formattedTime);
    }
}

