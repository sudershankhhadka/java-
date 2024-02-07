package loop;

public class ForLoop {
    /*
    ---------for-loop---------
    syntax:
        for(initialization;condition;inc/dec){
        //statement
        }
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0;i<=100;i++) {
            sum+=i;
        }
        System.out.println(sum);
        //for odd sum
        int oddSum=0;
        for(int i = 1;i<=100;i+=2){
            oddSum+=i;
        }
        System.out.println("odd sum:"+oddSum);
        int evenSum = 0;
        for(int i = 0;i<=100;i+=2){
            evenSum+=i;
    }
        System.out.println("Even Sum:"+evenSum);
    }


}
