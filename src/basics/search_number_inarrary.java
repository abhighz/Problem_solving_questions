package basics;

import java.util.Scanner;

public class search_number_inarrary {
    static int [] makeFrequ(int []arr){
        int []freq=new int[100005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        int []arr={1,2,3,45,65,34,66,44,67,78,89,98,23};
        int []freq=makeFrequ(arr);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of query: -");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("Enter the search elemet in array :- ");
            int x=sc.nextInt();
            if(freq[x]>0){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
            }
            q--;
        }
    }

