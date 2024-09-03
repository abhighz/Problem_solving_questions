package basics;

import java.util.Scanner;

public class time{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        System.out.println("enter the number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
         ans+=i;
        }
        System.out.println(ans);
    }
}
