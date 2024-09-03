package lists;

import java.util.Scanner;

public class SelectionSort {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void selection(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_value_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_value_index])
                {
                   min_value_index=j;
                }
            }
            swap(arr,i,min_value_index);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of arr:- ");
        int n= sc.nextInt();
        int []arr=new int[n];
        System.out.print("enter the elements:- ");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        selection(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
