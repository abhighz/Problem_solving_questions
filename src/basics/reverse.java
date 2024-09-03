package basics;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        System.out.println("Enter the number do you want to Reverse:- ");
        int number=ab.nextInt();
        int reverse=0;
        while(number!=0){
            int digit=number%10;
            reverse=reverse*10+digit;
            number=number/10;
        }
        System.out.println("The Reverse number is :- "+reverse);
    }
}
