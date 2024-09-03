package basics;
import java.util.*;
public class compressed_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String :- ");
        String str=new String(sc.nextLine());
        String ans=" "+str.charAt(0);
        int count=1;
        for(int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            char prev=str.charAt(i-1);
            if(curr==prev){
                count++;
            }
            else{
                ans+=count;
                count=1;
                ans+=curr;
            }
        }
        ans+=count;
        System.out.println(ans);
    }
}
