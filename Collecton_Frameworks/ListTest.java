package Collecton_Frameworks;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
        List<String> list = new LinkedList<>();
        list.add("Nepal");
        list.add("China");
        list.add("Japan");
        list.add("Korea");

        list.remove(2);
        System.out.println(list.contains("Kathmandu"));
        for(String s :list){
            System.out.println(s);
        }
    }
}
