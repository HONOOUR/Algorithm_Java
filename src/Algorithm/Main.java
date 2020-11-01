package Algorithm;

public class Main {

    public static void main(String[] args) {
        System.out.println("Counting Sort starts.");
        new CountingSort();
        System.out.println("Counting Sort ends.");

        System.out.println("Heap Sort starts.");
        new HeapSort();
        System.out.println("Heap Sort ends.");

        System.out.println("BinarySearchTree starts.");
        new BinarySearchTree();
        System.out.println("BinarySearchTree ends.");

        System.out.println("RedBlackTree starts.");
        new RedBlackTree();
        System.out.println("RedBlackTree ends.");
    }
}
