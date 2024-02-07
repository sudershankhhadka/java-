package Arrays;

import java.util.Arrays;

public class ArraySortTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 45, 43, 23, 432, 34};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("-----------Reverseing Array-----------");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(Arrays.copyOf(array, 3)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(array, 2, 6)));
        Arrays.fill(array, 50);
        System.out.println(Arrays.toString(array));
        Arrays.fill(array, 1, 6, 400);
        System.out.println(Arrays.toString(array));
    }
}
//Other array methods
