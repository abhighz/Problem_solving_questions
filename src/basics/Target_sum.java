package basics;
import java.util.Scanner;
public class Target_sum {
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter the size of array :-");
        int n=ab.nextInt();
        int arr[]=new int [n];
        System.out.print("Enter the value of of array :- ");
        for(int j=0;j<n;j++){
            arr[j]=ab.nextInt();
        }
        System.out.print("Enter the value of Target sum :- ");
        int T=ab.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(T==arr[i]+arr[j]){
                    System.out.println("target sum is found :- "+ "index are : "+i+ "  and " +j);
                }
            }
        }

    }

}
