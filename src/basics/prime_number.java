package basics;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:- ");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++) {
            if (n % i == 0) {
                count++;
            }
        }
            if(count==2){
                System.out.print("is a prime number:- "+n);
            }
            else {
                System.out.print("not a prime number:- "+n);
            }
        }
    }

