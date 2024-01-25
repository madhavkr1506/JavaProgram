// Write a program to multiply one matrix with itself :

package ClassWork;

import java.util.Scanner;

public class ClassWork16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Matrix size is 3 X 3

        int[][] two_dim = new int[3][3];

//        Putting elements inside the matrix

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                two_dim[i][j] = scanner.nextInt();
            }
        }

//        Printing matrix elements

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(two_dim[i][j]+" ");
            }
            System.out.println();
        }

//         Multiply matrix with itself :

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int sum = 0;
                for(int k=0;k<3;k++) {
                    sum += two_dim[i][k] * two_dim[k][j];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
