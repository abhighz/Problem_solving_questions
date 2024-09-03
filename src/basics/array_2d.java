package basics;
import java.util.Scanner;
public class array_2d{
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);

        System.out.print("Enter the of row :- ");
        int n=ab.nextInt();
        System.out.print("Enter the value of col :- ");
        int m=ab.nextInt();

        int arr[][]=new int[n][m];
        System.out.print("Enter the value of arr:- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=ab.nextInt();
            }
        }
        for(int k=0;k<n;k++){
            for(int t=0;t<m;t++){
                System.out.print(arr[k][t]+"  ");
            }
            System.out.println();

        }
        System.out.println(arr.length);
    }

}

