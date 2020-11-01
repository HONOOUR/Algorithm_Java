package Algorithm;

public class HeapSort {
    public HeapSort() {
        int data[] = { 5, 2, 1, 7, 112, 42, 52, 62 };
        int count = data.length -1;
        for (int i = count/2; i >= 0; i--) { //node i's parent node (not leaf node)
            System.out.println("i=" + i);
            maxHeapify(data, i);
        }
    }

    public void maxHeapify(int data[], int i) {
        int count = data.length -1;
        int leftChild = i*2 + 1;
        int rightChild = leftChild + 1;

        if (leftChild > count && rightChild > count) {
            return;
        } else if (rightChild > count && data[leftChild] > data[i]) {
            swap(data, leftChild, i);
            maxHeapify(data, leftChild);
            printArray(data);
        } else if (leftChild > count && data[rightChild] > data[i]) {
            swap(data, rightChild, i);
            maxHeapify(data, rightChild);
            printArray(data);
        } else {
            if (data[leftChild] > data[i] && data[leftChild] > data[rightChild]) {
                swap(data, leftChild, i);
                maxHeapify(data, leftChild);
                printArray(data);
            }else if (data[rightChild] > data[i]) {
                swap(data, rightChild, i);
                maxHeapify(data, rightChild);
                printArray(data);
            }
        }
    }

    public void printArray(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public void swap(int data[], int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
