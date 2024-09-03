package lists;

import java.util.Scanner;

public class sumOfDigit {
    static int sumofdigit(int n) {
        if (n >= 0 && n <= 9) return n;
        int sum = sumofdigit(n / 10) + n % 10;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(sumofdigit(n));
    }
}
