package CodeExercises;

public class Tree {
        //level 0: 2^0 = 1
        //level 1: 2^1 = 2
        //level 2: 2^2 = 4
        //level 3: 2^3 = 8
        // # of nodes = 2^h-1; if we know the height we know the number of nodes
        //log nodes = steps log 100 = 2 (10^2 = 100)
        //Divide and Conquer only need to see a subset
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node (int value) {
            this.value = value;
        }
        
        @Override
        public String toString() {
            return "Node=" + value;
        }
    } 

    private Node root;

    public void insert(int value) {
        var node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }

        var current = root;

        while (true) {
            if (value < current.value){
                if (current.leftChild == null){
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            }
            else {
                if (current.rightChild == null){
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find (int value) {
        var current = root;

        while(current != null){
            if (value < current.value){
                current = current.leftChild;
            } else if (value > current.value){
                current = current.rightChild;
            } else {
                return true;
            }
        }
        return false;
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }
    
    private void traversePreOrder(Node root) {
        if (root == null){
            return;
        }

        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }
    
    private void traverseInOrder(Node root) {
        if (root == null){
            return;
        }

        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }
    
    private void traversePostOrder(Node root) {
        if (root == null){
            return;
        }

        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println(root.value);
    }
}
