package basics;

public class reapeat_number {
    static int repo(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr={1,3,4,3,2,2,3,4,4};
        System.out.println("The first repeated number is :- "+repo(arr));
    }
}
