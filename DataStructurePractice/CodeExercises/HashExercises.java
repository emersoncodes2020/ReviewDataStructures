package CodeExercises;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashExercises {
    private static void hashMethod() {
        Map<String, String> map = new HashMap<>();
        map.put("123456-A", "Christina");
        System.out.println(hash("123456-A"));
    }

    public static int hash(String key){
        String s = "";
        s.hashCode();
        int hash = 0;
        for (var ch : key.toCharArray()){
            hash += ch;
        }
        return hash % 100;
    }

    public static void firstNonRepeatingChar(){
        //hash map
        CharacterFinder finder = new CharacterFinder();
        var ch = finder.findFirstNonRepeatingChar("a green apple");
        System.out.println(ch);
    }

    //hash set
    public static void hashSet(){
        Set<Integer> set = new HashSet<>();
        int[] numbers = {1,2,3,3,2,1,4};
        for (var number : numbers){
            set.add(number);
        }
        System.out.println(set);
    }
}
