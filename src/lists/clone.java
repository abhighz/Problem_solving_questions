package lists;

class test {
    int x;
    int y;
    test() {
         x = 100;
         y = 100;
    }
}
public class clone {
    public static void main(String[] args) {
        test t=new test();
        System.out.println(t.y+" "+t.x);
    }
}
