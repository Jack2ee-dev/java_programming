import java.util.Arrays;

public class MainProgram {
    public static int smallest(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int indexOfSmallest(int[] array) {
        int idx = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                idx = i;
            }
        }
        return idx;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int idx = startIndex;
        int min = Integer.MAX_VALUE;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < min) {
                min = table[i];
                idx = i;
            }
        }
        return idx;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int idxMin = indexOfSmallestFrom(array, i);
            swap(array, i, idxMin);
        }
    }
}
