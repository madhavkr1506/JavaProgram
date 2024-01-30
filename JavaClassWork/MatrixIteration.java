// Matrix iteration

import java.util.Scanner;

public class MatrixIteration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] two_dim = new int[2][3];

        // taking elements to the matrix 
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                two_dim[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        // printing elements of a matrix 
        System.out.println("printing matrix : ");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(two_dim[i][j] + " ");
            }
            System.out.println();
        }

        // printing one row 
        System.out.println("Printing first row : ");
        for(int i=0;i<two_dim[0].length;i++){
            System.out.print(two_dim[0][i]+" ");
        }
        System.out.println();

        // printing second row
        System.out.println("printing second row : ");
        for(int i=0;i<two_dim[1].length;i++){
            System.out.print(two_dim[1][i]+" ");
        }
        System.out.println();

        // printing first column
        System.out.println("printing first column : ");
        for(int i=0;i<2;i++){
            for(int j=0;j<1;j++){
                System.out.print(two_dim[i][j]+" ");
            }
            System.out.println();
        }
        
        // printing second column
        System.out.println("printing second column : ");
        for(int i=0;i<2;i++){
            for(int j=1;j<2;j++){
                System.out.print(two_dim[i][j]+" ");
            }
            System.out.println();
        }

        // printing third column
        System.out.println("printing third column : ");
        for(int i=0;i<2;i++){
            for(int j=2;j<3;j++){
                System.out.print(two_dim[i][j]+" ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
