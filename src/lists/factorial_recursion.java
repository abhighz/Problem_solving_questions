package lists;

import java.util.Scanner;

public class factorial_recursion {
    static int factorial(int n){

        if(n==0) {
            return 1;
        }

            return n * factorial(n - 1);
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:- ");
        int x=sc.nextInt();
        System.out.println(factorial(x));
    }
}
