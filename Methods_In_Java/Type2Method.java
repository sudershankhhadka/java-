package Methods_In_Java;

public class Type2Method {
    public static void main(String[] args) {
        printTable(9);
    }

    //no return type with arguments
    static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
