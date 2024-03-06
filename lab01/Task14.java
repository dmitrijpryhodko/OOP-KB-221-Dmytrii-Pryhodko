package lab01;

public class Task14 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 2, 7, 4};
        int[] array2 = {1, 3, 2, 7, 4};

        cycleSwap(array1, 1);
        printArray(array1);

        cycleSwap(array2, 3);
        printArray(array2);
    }
    public static void cycleSwap(int[] array, int shift) {
        if (array.length <= 1 || shift <= 0 || shift >= array.length) {
            return;
        }
        int[] temp = new int[shift];
        System.arraycopy(array, array.length - shift, temp, 0, shift);
        for (int i = array.length - shift - 1; i >= 0; i--) {
            array[i + shift] = array[i];
        }

        System.arraycopy(temp, 0, array, 0, shift);
    }
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

