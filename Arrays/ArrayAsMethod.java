package Arrays;



/*
--------array with method----------
1>array as argument
void add(int a[]){
}



2>array as return type:
void get10values(){
//array = 1234,5,67,65,432,345,6;
return array;
 */

public class ArrayAsMethod {
    public static void main(String[] args) {
        //------------array as argument-----------------

        //int array[] ={1,23,45,67,86,54,32};
        sum(new int[]{1, 2, 3, 45, 43, 23, 432, 34}); // anonymous array
    }

    static void sum(int[] values) {
        int s = 0;
        for (int x : values) {
            s += x;
        }
        System.out.print("Sum:" + s);
    }


}
