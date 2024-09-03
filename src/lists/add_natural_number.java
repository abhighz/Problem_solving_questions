package lists;

import java.util.Scanner;

public class add_natural_number {
    static int  add(int n){
        if (n==1){
            System.out.println(n);
            return n;
        }
     return n + add(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :- ");
        int x= sc.nextInt();
        System.out.println(add(x));
    }
}
