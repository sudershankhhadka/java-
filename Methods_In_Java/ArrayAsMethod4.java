package Methods_In_Java;


/*
Write a Java program that defines a method called findAverage which takes an array of integers as a parameter and returns
the average of the elements in the array. Also, implement a main method to test your findAverage method with an array of integers.
 */
public class ArrayAsMethod4 {
    public static void main(String[] args) {
        int[] avergaeToCalculate = {321, 32, 13, 32, 32};
        findAverage(avergaeToCalculate);
    }

    static void findAverage(int[] arr) {
        int avg;
        int sum = 0;
        for (int i : arr) {
            sum += i;

        }
        avg = sum / arr.length;
        System.out.println(avg);

    }
}