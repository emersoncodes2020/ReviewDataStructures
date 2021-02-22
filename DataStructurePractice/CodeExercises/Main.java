package CodeExercises;

public class Main {
    public static void main(String[] args){
        //green apple

        //data structure to quickly lookup a value HashTable
        //set of characters
        CharacterFinder finder = new CharacterFinder();
        var ch = finder.findFirstRepeatedChar("green apple");
        System.out.println(ch);
    }
}
