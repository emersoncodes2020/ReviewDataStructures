// Exercise of Doubly Linked List

public class DoublyLinkedList<T> implements Iterable<T> {
    private int size = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    private static class Node<T> {
        private T data;
        private Node<T> prev, next;

        public Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        public String toString() {
            return data.toString();
        }
    }

    // Emptying the linked List, Complexity = O(n) Linear
    public void clear() {
        Node<T> traverse = head;
        while (traverse != null) {
            Node<T> next = traverse.next;
            traverse.prev = null;
            traverse.next = null;
            traverse.data = null;
            traverse = next;
        }
        head = null;
        tail = null;
        traverse = null;
        size = 0;
    }
}