package loop;

public class EnhanceForLoop {

    /*
    ----------Enhance for loop-------------
    ---------for each loop--------------
    #used to read data from collection(array,list,set,map,etc)

    syntax:
    for(data_type var: collection){
        //statements;
        }
     */

    public static void main(String[] args) {
        int[] values = {12,34,56,63,4,5,6,23,45,6};
        int sum=0;
        for (int x : values //--> values here indicates the size of the collection   ---> int is the data type  -->x is variable ; can be directly declared iside the loop scope
             ) {
            sum+=x;

        }
        System.out.print(sum);

    }
}
