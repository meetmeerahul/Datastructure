public class MinHeap {

    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.heap = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap[0];
    }

    public void insert(int value) {
        if (size == capacity) {
            throw new IllegalStateException("Heap is full");
        }
        heap[size] = value;
        int currentIndex = size;
        int parentIndex = getParentIndex(currentIndex);
        while (parentIndex >= 0 && heap[parentIndex] > heap[currentIndex]) {
            swap(parentIndex, currentIndex);
            currentIndex = parentIndex;
            parentIndex = getParentIndex(currentIndex);
        }
        size++;
    }

    public int removeMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);
        return min;
    }

    private void heapify(int index) {
        int leftChildIndex = getLeftChildIndex(index);
        int rightChildIndex = getRightChildIndex(index);
        int smallestIndex = index;
        if (leftChildIndex < size && heap[leftChildIndex] < heap[smallestIndex]) {
            smallestIndex = leftChildIndex;
        }
        if (rightChildIndex < size && heap[rightChildIndex] < heap[smallestIndex]) {
            smallestIndex = rightChildIndex;
        }
        if (smallestIndex != index) {
            swap(index, smallestIndex);
            heapify(smallestIndex);
        }
    }

    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    private int getLeftChildIndex(int index) {
        return 2 * index + 1;
    }

    private int getRightChildIndex(int index) {
        return 2 * index + 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }


    public void display(){

        for(int i=0;i<heap.length-1;i++){
            System.out.println(heap[i]);
        }
    }



    public static void main(String[] args) {
        MinHeap heap=new MinHeap(10);

        heap.insert(10);
        heap.insert(20);
        heap.insert(1);
        heap.insert(2);
        heap.insert(5);
        heap.insert(6);


        heap.removeMin();

        heap.display();
    }
}
