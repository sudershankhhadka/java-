package Collecton_Frameworks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
//        Map<String,Integer> map =  new HashMap<>();
//        Map<String,Integer> map =  new TreeMap<>();
        Map<String,Integer> map =  new LinkedHashMap<>();
        map.put("English",90);
        map.put("Nepali",80);
        map.put("Math",80);
        for(String key: map.keySet()){
            System.out.println(key +" = "+map.get(key));
        }
    }
}
