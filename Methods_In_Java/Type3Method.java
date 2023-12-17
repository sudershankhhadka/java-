package Methods_In_Java;

public class Type3Method {
    public static void main(String[] args) {

        int x = getSumOF1to100();
        System.out.println(x);
    }

    //return type with no arguments
    static int getSumOF1to100() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

}
