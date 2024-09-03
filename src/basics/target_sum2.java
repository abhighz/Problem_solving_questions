package basics;

public class target_sum2 {
    static int trget1(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int []   arr={1,2,3,4,5,6};
        int k=5;
        System.out.println("ther value of count is "+trget1(arr,k));
    }
}
