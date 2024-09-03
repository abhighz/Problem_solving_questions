package basics;

import java.util.Scanner;

public class query_prefix {
    static int[] prefix(int[] arr) {
        int n = arr.length;
        int[] pre_sum = new int[n];
        pre_sum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pre_sum[i] = pre_sum[i - 1] + arr[i];
        }
        return pre_sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int S = sc.nextInt();
        int[] arr = new int[S];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < S; i++) {
            arr[i] = sc.nextInt();
        }

        int[] pre_sum = prefix(arr);
        int n = arr.length;
        System.out.print("Enter the number of queries: ");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.print("Enter the start range: ");
            int l = sc.nextInt();
            System.out.print("Enter the end range: ");
            int r = sc.nextInt();
            if (l < 0 || r >= n || l > r) {
                System.out.print("Invalid range!");
                continue;
            }
            int ans = pre_sum[r]-pre_sum[l-1];
            System.out.println("The sum is: " + ans);
        }
    }
}
