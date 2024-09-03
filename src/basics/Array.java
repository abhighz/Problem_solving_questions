package basics;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter the size of array :-");
        int n=ab.nextInt();
        int and[]=new int [n];
        System.out.print("Enter the value of of array :- ");
        for(int j=0;j<n;j++){
            and[j]=ab.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i==0){
                System.out.print("The value of the arry is :- ");
            }
            System.out.print(" "+and[i]);
        }

    }

}
