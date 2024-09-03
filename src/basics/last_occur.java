package basics;

import java.util.Arrays;
import java.util.Scanner;

public class last_occur {
    static int last(int[] arr, int x) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
            }
        }
        return index;
    }

    static int greater(int[] arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,3,2,2,4,5,5,8,7,7,8,7,5,4,8,4,8,7,9,2,6,5,1,4,8,8,7,9,4,9,7,4,6,6,4,9,8};
//        int[] arr={1,2,3,4,5,6,7};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
//        System.out.println("Enter the number which you find the last occur: - ");
//     int x=sc.nextInt();
//        System.out.println("And also Enter the number that you findout the how many number are greaterfrom this  number  : -");
//    int y=sc.nextInt();
//        System.out.println(x+" "+"last occurse number index is :- " + last(arr, x));
//        System.out.println(y+" " +"count of the largest elements in arr from the "+y+":- Is "+greater(arr,y));
    }
}
