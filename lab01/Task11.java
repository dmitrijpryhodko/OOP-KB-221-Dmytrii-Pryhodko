package lab01;

public class Task11 {
    public static void main(String[] args){
        int[] array = {1, 2, 36, 14, 53, 61, 7, 8, 9};
        int ENsum = sum(array);
        System.out.println("Сума парних чисел: " + ENsum);
    }

    public static int sum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int ENsum = 0;

        for (int number : array) {
            if (number % 2 == 0) {
                ENsum += number;
            }
        }

        return ENsum;
    }

    }




