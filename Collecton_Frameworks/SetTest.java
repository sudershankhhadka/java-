package Collecton_Frameworks;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
//        Set<String> s = new HashSet<>();
        //Set<String> s = new TreeSet<>();   // in order ascending
        Set<String> s = new LinkedHashSet<>();
        s.add("java");
        s.add("java");
        s.add("python");
        s.add("ruby");
        s.add("python");
        for(String sd : s ){
            System.out.println(sd);
        }
    }
}
