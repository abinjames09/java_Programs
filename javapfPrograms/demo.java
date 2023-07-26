import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // size of the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // array elements
        }
        int k = scanner.nextInt(); // k value
        
        // Sort the first k elements of the array in ascending order
        Arrays.sort(arr, 0, k);
        
        // Print the sorted array up to index k
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        
        // Print the remaining elements of the original array in their original order
        for (int i = k; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
