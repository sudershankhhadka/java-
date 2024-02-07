package loop;

public class WhileTest {
    /*
    ------------syntax----------
    //syntax:

            while(condition){
            //statement;
            //inc/dec;
            }
     */

    public static void main(String[] args) {
        //6! = 6x5x4x3x2x1 =720;
        int n = 6;
        int fact =1;
        while(n!=0){
            fact *=n;
            n--;
        }
        System.out.println(fact);

    }
}
