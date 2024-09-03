package basics;
import java.util.Scanner;
public class Sum_of_all_element{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of arr: -");
        int n=sc.nextInt();
        int sum=0;
        float arr[]=new float[n];
        System.out.print("Enter Your Array values : - ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            sum+=arr[j];
        }
        System.out.println("The sum of all element of array is: -  "+sum);
    }
}
