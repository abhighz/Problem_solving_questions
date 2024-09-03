package lists;

public class bunary_search {
    static int  binarySearch(int []arr,int target){
        int n= arr.length;
        int low=0;
        int high=n-1;
        while (low <= high){
            int mid=(low+high)/2;
            if(arr[mid]==target) {
                System.out.println("the target at index :- " + mid);
                return 0;
            } else if (target < arr[mid]) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int target=5;
        System.out.println(binarySearch(arr,target));
    }
}
