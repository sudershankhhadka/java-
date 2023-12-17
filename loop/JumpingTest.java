package loop;

public class JumpingTest {


    /*
    ---------------Jumping Statement----------
    1> Continue : skip values
    2>Break     : exit from the loop
    3>Return    : exit from method
     */
    public static void main(String[] args) {
        for(int i = 1;i<=10;i++){

            if(i==5){
//                break;
//                continue;
                return;   //focuses on main method
                //cannot be written any statements after these keywords

            }

            System.out.println(i);
        }
        System.out.println("End for loop");
    }
}
