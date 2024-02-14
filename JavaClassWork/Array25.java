public class Array25 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n=array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                System.out.print(array[j][i]+" ");
            }
            System.out.println();
        }
    }
}
