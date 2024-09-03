package lists;

import java.util.Scanner;

public class Binary_search_reccu {
    static int binarySearch(int[] arr, int st, int end, int target) {
        if (st > end) return -1;  // Return -1 if the target is not found
        int mid = (st + end) / 2;
        if (target == arr[mid]) return mid;  // Return the index if the target is found
        else if (target < arr[mid]) {
            return binarySearch(arr, st, mid - 1, target);  // Recurse into the left half
        } else {
            return binarySearch(arr, mid + 1, end, target);  // Recurse into the right half
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int n = a.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target value:");
        int target = sc.nextInt();
        int result = binarySearch(a, 0, n - 1, target);
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found.");
        }
        sc.close();
    }
}
