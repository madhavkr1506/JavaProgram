public class Array26 {

    // public static void rotatematrix(int[][] array){
    //     int n = array.length;
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             int temp = array[i][j];
    //             array[i][j] = array[j][i];
    //             array[j][i] = temp;
    //         }
    //     }

    //     for(int i=0;i<n;i++){
    //         int left = 0;
    //         int right = n - 1;
    //         while(left < right){
    //             int temp = array[i][left];
    //             array[i][left] = array[i][right];
    //             array[i][right] = temp;
    //             left++;
    //             right--;
    //         }
    //     }

    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             System.out.print(array[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }


    public static void rotatematrix(int[][] array){
        int n = array.length;
        int rotatedmatrix[][] = new int[n][n];



        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotatedmatrix[j][n-i-1] = array[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(rotatedmatrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        rotatematrix(array);
    }
}