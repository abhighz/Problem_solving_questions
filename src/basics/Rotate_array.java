package basics;

import java.util.Scanner;

public class Rotate_array {
    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n];
        k = k % n;
        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,6,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rotations: ");
        int k = sc.nextInt();
        int[] rotatedArray = rotate(arr, k);
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
    }
}
