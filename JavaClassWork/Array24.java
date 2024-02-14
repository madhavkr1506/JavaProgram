public class Array24 {
    public static void main(String[] args) {
        // int[][] array = new int[3][];
        // array[0] = new int[1];
        // array[1] = new int[2];
        // array[2] = new int[3];
        // for(int i=0;i<array.length;i++){
        //     for(int j=0;j<array[i].length;j++){
        //         System.out.print(array[i][j]+" ");
        //     }
        //     System.out.println();
        // }



        // column wise sum
        
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        
        for (int i = 0; i < 3; i++) {
            int sum=0;
            for (int j = 0; j < 3; j++) {
                sum+=array[j][i];

            }
            System.out.print(sum+" ");
        }
        

    }
}
