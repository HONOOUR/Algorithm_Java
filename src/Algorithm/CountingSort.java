package Algorithm;

public class CountingSort {

    public CountingSort() {
        int[] A = new int[] {0,2,1,2,2,3,1,1};
        Count(A, 0, 4);
    }

    public void Count(int[] A, int i, int k) {
        int[] C = new int[k];
        while(i < k) {
            C[A[i]]++;
            System.out.println("A["+ i +"] = " + A[i]);
            System.out.println("C[A["+ i +"]] = " + C[A[i]]);
            i++;
        }
        CumulativeSum(C, 0, C.length-1);
    }

    public void CumulativeSum(int[] C, int i, int k) {
        int[] B = new int[C.length];
        if (i > C.length-1) {
            return;
        }
        if (i < 1) {
            B[i] = C[i];
            System.out.println("B["+ i +"] = " + B[i]);
            System.out.println("C["+ i +"] = " + C[i]);
            i++;
        }
        B[i] = B[i-1] + C[i];
        System.out.println("B["+ i +"] = " + B[i]);
        System.out.println("B["+ (i-1) +"] = " + B[i-1]);
        System.out.println("C["+ i +"] = " + C[i]);
        i++;
        CumulativeSum(C, i, C.length-1);

    }

}
