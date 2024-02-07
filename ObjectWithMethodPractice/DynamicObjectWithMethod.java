package ObjectWithMethodPractice;
import java.util.Scanner;
public class DynamicObjectWithMethod {
    public static void main(String[] args) {
        DynamicObjectWithMethod d = new DynamicObjectWithMethod();



    }
    GateSensor[] getDetails(){
        GateSensor []gArr = new GateSensor[4];
        for(int i = 0 ;i <4;i++) {
            GateSensor g = new GateSensor();
            System.out.println("Number of people entered: "+g.getNo_of_people_entered());
            System.out.println("Name: "+g.getName());
            System.out.println("Passcode: "+g.isPasscode());
            System.out.println("Relation with me: "+ g.getRelation());
            gArr[i] = g;
        }
        return gArr;
    }

    void setDetails(GateSensor g){
                Scanner s = new Scanner(System.in);
        System.out.println("Enter the name: ");
                g.setName(s.next());
//        System.out.println("Have passcode?: ");
//        boolean b = s.nextBoolean();
//        g.isPasscode(b);
        System.out.println("Your relation with me?: ");
        g.setRelation(s.next());



    }


    }



