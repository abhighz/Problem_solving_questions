package basics;
import java.util.Scanner;
public class Decimal_to_binary{
    public static void main(String[] args) {
        Scanner abhi=new Scanner (System.in);
        System.out.println("enter the value you want to find");
        int num=abhi.nextInt();
        int ans=0;
        int power=1;
        while (num>0) {
            int binary= num%2;
            ans=ans+(binary*power);
            power*=10;
            num= num/2;
        }
        System.out.print("binary of the number  - : " +ans);
    }

}
