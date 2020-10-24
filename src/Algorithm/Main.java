package Algorithm;

public class Main {

    public static void main(String[] args) {
        // Counting Sort
        int[] A = new int[] {0,2,1,2,2,3,1,1};
        CountingSort countingSort = new CountingSort();
        countingSort.Count(A, 0, 4);
    }
}
