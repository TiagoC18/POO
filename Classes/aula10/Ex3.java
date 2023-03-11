package aula10;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ex3 {
    public static void main(String[] args) {
        String frase = "Hello World";
        char[] arr = frase.replaceAll("\\s+", "").toCharArray();
        Map<Character, TreeSet<Integer>> map = new TreeMap<>();

        for(int i=0;i<arr.length;i++) {
            Character c = arr[i];
            if(map.containsKey(c)) {
                map.get(c).add(i);
            }
            else{
                TreeSet<Integer> set = new TreeSet<>();
                set.add(i);
                map.put(c, set);
            }
        }
        System.out.println(map.entrySet());
    }
}
