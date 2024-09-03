package basics;

import java.util.Scanner;

public class multiplytwo_array{
    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multi(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Wrong input multiplication is not possible:");
            return;
        }
        int[][] ans = new int[c1][r2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    ans[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        print(ans);
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
            for (int j = 0; j < x; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("enter second array row  & col");
        int m = sc.nextInt();
//        System.out.println("enter second array  col ");
        int p = sc.nextInt();
        int[][] brr = new int[n][x];
        System.out.print("enter  the second array elements:- ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                brr[i][j]=sc.nextInt();
            }
        }
        multi(arr,n,x,brr,m,p);
    }
}
