package basics;

import java.util.Scanner;

public class occurce {
    static int countter(int [] arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
          if(arr[i]==x) {
              count++;
          }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array :- ");
        int n=sc.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter the element :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of x :- ");
        int x=sc.nextInt();
        System.out.print(countter(arr,x));

            }
        }

