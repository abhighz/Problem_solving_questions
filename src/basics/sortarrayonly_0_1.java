package basics;

public class sortarrayonly_0_1{
    static void sort1(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < count) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr={1,1,1,0,0,0,1,1,0,0};
            sort1(arr);
            for(int i=0;i< arr.length;i++){
                System.out.print(" "+arr[i]);
            }
        }
    }
