package basics;

import java.util.Arrays;
import java.util.Scanner;

public class  squre{
    static int[] squqrefind(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int k = 0;
        int[] ans = new int[n];
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--; // Fix: decrement right pointer
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array :- ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.print("Enter the elemet: -");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans = squqrefind(arr);
        Arrays.sort(ans);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(" "+ans[i]);
        }
    }
}
