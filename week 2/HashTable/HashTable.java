public class HashTable {

    private HashNode[] buckets;
    private int numOfBuckets;// capacity
    private int size;//number of key value pairs in hash table

    public HashTable() {
        this.numOfBuckets = 10;
    }

    public HashTable(int capacity) {

        this.numOfBuckets = capacity;
        buckets = new HashNode[capacity];
        this.size = 0;
    }

    class HashNode {

        Integer key;
        String value;
        HashNode next;

        HashNode(int key, String value) {
            this.key = key;
            this.value = value;
        }

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void put(Integer key, String value) {

        if (key == null || value == null) {
            throw new IllegalArgumentException("Key or value is null");
        }

        int bucketIndex = getBucketIndex(key);

        HashNode head = buckets[bucketIndex];
        while (head != null) {

            if (head.key.equals(key)) {

                head.value = value;
                return;
            }
            head = head.next;
        }

        size++;

        head = buckets[bucketIndex];

        HashNode node = new HashNode(key, value);
        node.next = head;

        buckets[bucketIndex] = node;

    }

    private int getBucketIndex(int key) {

        return key % numOfBuckets;
    }

    public String get(Integer key) {

        int bucketIndex = getBucketIndex(key);

        HashNode head = buckets[bucketIndex];

        while (head != null) {

            if (head.key.equals(key)) {

                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public String remove(Integer key) {
        return null;
    }

    public static void main(String[] args) {

        HashTable table = new HashTable(10);

        table.put(102, "Rahul");
        table.put(108, "Amar");

        System.out.println(table.size);

        System.out.println(table.get(108));

    }

}