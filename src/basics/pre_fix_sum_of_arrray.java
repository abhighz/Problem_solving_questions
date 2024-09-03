package basics;

public class pre_fix_sum_of_arrray {
    static int [] prefix(int []arr){
        int n=arr.length;
//        int []pre_sum=new int[n];
//        pre_sum[0]=arr[0];
        arr[0]=arr[0];
        for(int i=1;i<n;i++){
//            pre_sum[i]=pre_sum[i-1]+arr[i];
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        int[] pre_sum=prefix(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(" "+pre_sum[i]);
        }
    }
}
