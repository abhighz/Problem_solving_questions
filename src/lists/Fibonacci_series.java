package lists;

import java.util.Scanner;

public class Fibonacci_series {
    static  int fibo(int n){
        if(n==0 || n==1) return n;
        int prev=fibo(n-1);
        int prev_prev=fibo(n-2);
        return prev + prev_prev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int x=sc.nextInt();
        for(int i=0;i<=x;i++) System.out.print(fibo(i)+",");
//        System.out.println(fibo(x));
    }
}
