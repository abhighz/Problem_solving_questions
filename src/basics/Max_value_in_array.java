package basics;

public class Max_value_in_array {
    static int max(int []arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int []arr={1,6,7,5,3,4};
        System.out.println(max(arr));
    }
}
