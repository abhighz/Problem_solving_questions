package basics;
import java.util.Arrays;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of arr: -");
        int n=sc.nextInt();
        int []arr=new int[n];
        int x=arr.length;
        System.out.print("Enter the arrays Elements: -");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int j=0;
    while(0<n-1){

        System.out.print(" " +arr[j]);
        x--;
        j++;
        }
    }

}
