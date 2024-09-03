package  basics;
public class sparks_matrix {
    public static void main(String[] args) {
        int arr[][]=
                {
                        {0,0,3,0,4},
                        {0,0,5,7,0},
                        {0,0,0,0,0},
                        {0,2,6,0,0}
                };
        int size=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                if(arr[i][j]!=0){
                    size++;
                }
            }
        }
        int col=0;
        int compact[][]=new int [3][size];
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++) {
                if (arr[i][j] != 0) {

                    compact[0][col] = i;
                    compact[1][col] = j;
                    compact[2][col] = arr[i][j];
                    col++;
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<size;j++){
                System.out.print("  "+compact[i][j]);
            }

            System.out.println( );
        }
    }
}


