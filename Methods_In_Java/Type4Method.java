package Methods_In_Java;

public class Type4Method {
    public static void main(String[] args) {
        int x = findSmallest(34, 67);
        System.out.println(x);
    }

    //return type with argument
    static int findSmallest(int x, int y) {
//        if(x<y){
//            return x;
//        }
//        else
//            return y;
        return x < y ? x : y;
    }


}
