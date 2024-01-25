// Write a java program to print sum of all elements inside a matrix :

package ClassWork;

import java.util.Scanner;

public class ClassWork18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] two_dim = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                two_dim[i][j]= scanner.nextInt();
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(two_dim[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum+=two_dim[i][j];
            }
        }

        System.out.println(sum);
    }
}
