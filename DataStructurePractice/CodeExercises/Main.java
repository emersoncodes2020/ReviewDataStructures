package CodeExercises;

import java.util.Stack;
import java.util.Queue;

public class Main {
    public static void main(String[] args){
        
    }

    //Reversing a Queue
    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }
}
