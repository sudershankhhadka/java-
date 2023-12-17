package loop;

public class DoWhileTest {
    /*
    ---------do while loop/ post iteration loop--------------
    syntax:
    do{
    //statement
    }
    while(condition){
    //statement
    //inc/dec;
    }
     */

    public static void main(String[] args) {
        /*
        9x1=9
        9x2=18
        ------



        ------
        9x10=90
         */
        int mult = 9;
        int n = 1;
        int mu =9;
        do{
            System.out.println(" 9  x "+n + " " +"=" +mu);
            n++;
            mu = n*mult;

        }
        while(n<=10);



    }
}
