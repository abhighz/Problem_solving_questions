package basics;
import java.util.Scanner;
public class Factorial_Finder {
    public static void main(String[] args) {
        Scanner AB=new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int a=AB.nextInt();
        int total=1;
        for(int i=1;i<=a;i++){
            total=total*i;
        }
        System.out.println("Factorial of the number is :- "+total);
    }
}
