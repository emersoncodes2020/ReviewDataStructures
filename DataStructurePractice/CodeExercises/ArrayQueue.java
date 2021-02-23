package CodeExercises;

import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class ArrayQueue {
    private int[] items;
    private int rear;
    private int count;
    private int front;

    public ArrayQueue(int capacity){
        items = new int[capacity];
    }

    public void enqueue(int item){
        if (count == items.length){
            throw new IllegalStateException();
        }
        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue(){
        var item = items[front++];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    // [60, 70, 30, 40, 50]
    // 
    // 5 -> 0 left % length
    // 6 -> 1
    // 7 -> 2
    // 8 -> 3
    // 9 -> 4
    // 10 -> 0
    // 11 -> 1

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

    @Override
    public String toString(){
        return Arrays.toString(items);
    }

}
