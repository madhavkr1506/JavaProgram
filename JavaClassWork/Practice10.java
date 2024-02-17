public class Practice10 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] temp = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] res = new int[array.length][temp[0].length];
        // for(int i=0;i<array.length;i++){
        //     for(int j=0;j<array[i].length;j++){
        //         System.out.print(array[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=0;i<array.length;i++){
        //     for(int j = i + 1;j<array[i].length;j++){
        //         int temp = array[i][j];
        //         array[i][j] = array[j][i];
        //         array[j][i] = temp;
        //     }
        // }
        // System.out.println();


        for(int i=0;i<array.length;i++){
            for(int j = 0;j<temp[i].length;j++){
                int sum = 0;
                for(int k=0;k<array[i].length;k++){
                    sum+=temp[i][k] * array[k][j];
                    
                }
                res[i][j] = sum;
            }
            
        }

        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();


    }
}
