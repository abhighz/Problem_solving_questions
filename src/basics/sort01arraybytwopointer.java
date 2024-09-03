package basics;

import java.util.Scanner;

public class sort01arraybytwopointer {
        static void sort(int[] arr){
            int n=arr.length;
            int left=0;
            int right=n-1;
            for(int i=0;i<n;i++){
                if(arr[left]==1 && arr[right]==0){
                    int temp=arr[left];
                    arr[left]=arr[right];
                    arr[right]=temp;
                    left++;
                    right--;
                }
            }
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:- ");
        int x=sc.nextInt();
        int []arr=new int[x];
        for(int j=0;j<x;j++){
            arr[j]=sc.nextInt();
        }
        sort(arr);
        for(int i=0;i<x;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
