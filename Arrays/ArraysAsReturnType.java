package Arrays;

import java.util.Arrays;

public class ArraysAsReturnType {
    public static void main(String[] args) {
        int[] odd = getOddNumsFrom1to100();
        System.out.println(Arrays.toString(odd));
    }

    static int[] getOddNumsFrom1to100() {
        int[] oddNums = new int[50];
        int j = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                oddNums[j] = i;
                j++;
            }
        }
        return oddNums;

    }
}
