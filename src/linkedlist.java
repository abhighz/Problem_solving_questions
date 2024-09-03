
    class node{
        int data;
        node next;
        node(int data1,node next1){
            this.data=data1;
            this.next=next1;
        }
        node(int data){
            this.data=data;
            this.next=null;
        }
    };

public class linkedlist {
    public static void main(String[] args) {
        int [] arr={2,3,4,5,4};
        node y= new node(arr[3],null);
        System.out.println(y.data);
        System.out.println(y.next);
    }
}
