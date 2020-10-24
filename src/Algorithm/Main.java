package Algorithm;

public class Main {

    public static void main(String[] args) {
        // Counting Sort
        int[] A = new int[] {0,2,1,2,2,3,1,1};
        CountingSort countingSort = new CountingSort();
        countingSort.Count(A, 0, 4);

        int data[] = { 5, 2, 1, 7, 112, 42, 52, 62 };
        HeapSort h = new HeapSort(data);
    }
}
