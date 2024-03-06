package lab01;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.println("Введіть послідовність цілих чисел (нуль для завершення):");

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
            count++;
        }

        if (count == 0) {
            System.out.println("Послідовність не містить жодного числа.");
        } else {
            double average = (double) sum / count;
            System.out.println("Середнє значення: " + average);
        }

        scanner.close();
    }
}
