package basics;

public class sawap {
    static int swaper(int a, int b) {
        int temp = a;
        System.out.println("Before swap a is :-" + a);
        System.out.println("Before swap  b is :-" + b);
        a = b;
        b = temp;
        System.out.println("after swap a is:- " + a);
        System.out.println("after swap b is:-" + b);
        return 0;
    }
    static int swaper2(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("without temp a is : -"+a);
        System.out.println("without temp b is :- "+b);
        return 0;
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(swaper(a,b));
        System.out.println(swaper2(a,b));
    }
}
