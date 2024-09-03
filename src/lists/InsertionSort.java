package lists;
public class InsertionSort {
    static void insertionsort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1};
        insertionsort(arr);
        for(int j: arr){
         System.out.print(j + " ");
        }
    }
}
