package basics;

public class reverse_array {
    static int[] reverse(int[] arr) {
        int j = 0;
        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] reversedArr = reverse(arr);
        System.out.print("Reversed array is: ");
        for (int i = 0; i < reversedArr.length; i++) {
            System.out.print(reversedArr[i] + " ");
        }
    }
}
