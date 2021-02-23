package CodeExercises;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] numbers = { 7, 3, 1, 4, 6, 2, 3};
        var sorter = new MergeSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void findRepeatChar(){
        //green apple

        //data structure to quickly lookup a value HashTable
        //set of characters
        CharacterFinder finder = new CharacterFinder();
        var ch = finder.findFirstRepeatedChar("green apple");
        System.out.println(ch);
    }
}
