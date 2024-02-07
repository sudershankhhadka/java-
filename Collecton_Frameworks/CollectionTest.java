package Collecton_Frameworks;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,54,3,5,43,45,43,43,43,343,23);
        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.fill(list,78);
        System.out.println(list);


        //Next way of creating list,map,set:

        List<Integer> l = List.of(1,2,34,56,7,87,65,43,2,12,34,567,8);
        System.out.println(l);
        Set<Integer> s = Set.of(23,456,789,876,5,43,34,5678,987,654);    //in case of set need to pass not repeated elements
        System.out.println(s);
        System.out.println(Map.of("AA",123,"yy",76,"uu",90));

    }
}
