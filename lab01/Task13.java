package lab01;

import java.util.Arrays;


public class Task13 {
    public static void main(String[] args) {
        int[] inputArray = {18, 1, 3, 6, 7, -5};
        int[] outputArray = removeLocalMaxima(inputArray);

        System.out.println("Повний масив значень: " + Arrays.toString(inputArray));
        System.out.println("Масив без локальних максимумів: " + Arrays.toString(outputArray));
    }

    public static int[] removeLocalMaxima(int[] array) {
        int[] result = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if ((i > 0 && array[i] <= array[i - 1]) || (i != array.length - 1 && array[i] <= array[i + 1])) {
                result[j++] = array[i];
            }
        }

        return Arrays.copyOf(result, j);
    }
}