package Algorithm;

public class Main {

    public static void main(String[] args) {
        System.out.println("Counting Sort starts.");
        int[] A = new int[] {0,2,1,2,2,3,1,1};
        CountingSort countingSort = new CountingSort();
        countingSort.Count(A, 0, 4);
        System.out.println("Counting Sort ends.");

        System.out.println("Heap Sort starts.");
        int data[] = { 5, 2, 1, 7, 112, 42, 52, 62 };
        HeapSort h = new HeapSort(data);
        System.out.println("Heap Sort ends.");

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(10);
        bst.insert(6);
        bst.insert(2);
        bst.insert(1);
        bst.insert(4);
        bst.insert(11);
        bst.insert(13);

        bst.search(10);

        bst.delete(5);
        bst.delete(2);
    }
}
