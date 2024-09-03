package lists;
import basics.Array;

import java.util.*;

public class arraylist {
        static void reverse(ArrayList<Integer> list){
        int i=0,j= list.size()-1;
        while(i<j){
           int temp= list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(12);
        l1.add(13);
        l1.add(10);
        l1.add(112);
        l1.add(113);
        l1.add(123);
        l1.add(131);
        l1.add(107);
        l1.add(102);
        System.out.println("Original ArrayLIst is:- " + l1);//        Collections.sort(l1);
        Collections.reverse(l1);
        System.out.println("Reversed ArrayList:- " + l1);
    }
}
