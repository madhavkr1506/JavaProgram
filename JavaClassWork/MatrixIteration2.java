import java.util.Scanner;

public class MatrixIteration2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] two_dim = {{1,2,3},{4,5},{6,7,8,9}};

        // iterate over n number of rows:
        System.out.println("matrix iteration : ");
        int noOfRowToIterate = 2;
        for(int i=0;i<noOfRowToIterate && i<two_dim.length;i++){
            for(int j=0;j<two_dim[i].length;j++){
                System.out.print(two_dim[i][j]+ " ");
            }
            System.out.println();
        }

        // printing length of the two_dim matrix
        System.out.println("length of matrix : ");
        System.out.println(two_dim.length);
        // printing length of first row 
        System.out.println("length of first row : ");
        System.out.println(two_dim[0].length);
        // printing length of second row
        System.out.println("length of second row : ");
        System.out.println(two_dim[1].length);
        // printing length of third row
        System.out.println("length of third row : ");
        System.out.println(two_dim[2].length);


        scanner.close();
    }
}
