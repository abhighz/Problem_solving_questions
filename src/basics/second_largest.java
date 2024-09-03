package basics;

public class second_largest {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8};
        int largest=arr[0];
        int second=-1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>largest) {
                largest = -1;
            }
            for(int j=0;j<arr.length;j++){
                if(arr[i]>second && arr[i]!=largest ){
                    second=arr[i];
                }
            }
        }
        System.out.println("max value in arrayais :- "+second);
    }
}
