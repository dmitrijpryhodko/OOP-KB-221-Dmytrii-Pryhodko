package lab01;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rnd = new Random();

        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(101);
            System.out.print(array[i] + " ");
        }

            int max = array[0];
            for (i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
            System.out.println("\nМаксимальне значення: " + max);
        }
    }
