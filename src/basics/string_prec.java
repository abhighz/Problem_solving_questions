package basics;

import java.util.Scanner;

public class string_prec {
    public static void main(String[] args) {
      char [] ch=new char[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<ch.length;i++){
            ch[i]=sc.next().charAt(i);
        }
        for(int i=0;i<ch.length;i++) System.out.println(ch[i]);
    }
}
