package basics;

import java.util.Scanner;

public class rotate_90 {
    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] trnaspose(int [][] arr,int r,int c){
        int [] []ans=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=arr[j][i];
            }
        }
        return ans;
    }
    static void swap(int []arr,int n){
//       while()
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first array row & col ");
        int n = sc.nextInt();
//        System.out.print("enter first array  col ");
        int x = sc.nextInt();
        int[][] arr = new int[n][x];
        System.out.print("enter the first array elements:- ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <x; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int[][] ans= trnaspose(arr,n,x);
        print(ans);
    }
}
