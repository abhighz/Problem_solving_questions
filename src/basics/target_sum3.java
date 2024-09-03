package basics;

import java.util.Scanner;

public class target_sum3 {
    static int traget(int []arr,int tar){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==tar){
                        ans++;
                    }
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={1,2,3,4,5,6,7,8,9,};
        int target=sc.nextInt();
        System.out.println(traget(arr,target));
    }
}
