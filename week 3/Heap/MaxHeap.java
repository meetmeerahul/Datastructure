public class MaxHeap {

    private int[] heap;
    private int size;

    public MaxHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    public void insert(int value) {
        if (size == heap.length) {
            throw new IllegalStateException("Heap is full");
        }

        heap[size] = value;
        heapifyUp(size);
        size++;
    }

    public int removeMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }

        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return max;
    }

    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        if (heap[parentIndex] < heap[index]) {
            swap(parentIndex, index);
            heapifyUp(parentIndex);
        }
    }

    private void heapifyDown(int index) {
        int leftChildIndex = index * 2 + 1;
        int rightChildIndex = index * 2 + 2;
        int largestIndex = index;

        if (leftChildIndex < size && heap[leftChildIndex] > heap[largestIndex]) {
            largestIndex = leftChildIndex;
        }

        if (rightChildIndex < size && heap[rightChildIndex] > heap[largestIndex]) {
            largestIndex = rightChildIndex;
        }

        if (largestIndex != index) {
            swap(index, largestIndex);
            heapifyDown(largestIndex);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }


    public void display(){
        for(int i=0;i<heap.length;i++){

            System.out.println(heap[i]);
        }
    }

public static void main(String[] args) {

    MaxHeap heap = new MaxHeap(5);
heap.insert(5);
heap.insert(9);
heap.insert(3);
heap.insert(8);
//heap.insert(1);

int max = heap.removeMax();
System.out.println("Max element: " + max);


heap.display();
}
}
