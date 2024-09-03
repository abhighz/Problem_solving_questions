package basics;

public class secondH {
    static int second_max(int[] arr) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Find the maximum value in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                firstMax = arr[i];
            }
        }

        // Find the second maximum value in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] < firstMax) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int []arr={1,2,5,8,7,9,6,10};
        System.out.println(second_max(arr));
    }
}
