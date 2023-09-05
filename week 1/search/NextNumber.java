import java.util.Scanner;

class NextNumber {
    private static int findNextNumber(int[] numbers, int target) {
        int n = numbers.length;
        int start = 0, end = n - 1;

        int NextNumber = numbers[start];

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target < numbers[mid]) {
                NextNumber = numbers[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return NextNumber;
    }

    public static void main(String[] args) {
        System.out.println("Limit  :");
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter elements :");
        for (int i = 0; i < n; i++) {
            numbers[i] = keyboard.nextInt();
        }
        
        System.out.println("Enter Target nmuber:");
        int target = keyboard.nextInt();
        keyboard.close();
      
        System.out.printf("Smallest Number Grater than (%d) = %d", target, findNextNumber(numbers, target));
    }
}