// Write a java program to print sum of all diagonal elements :

package ClassWork;

import java.util.Scanner;

public class ClassWork17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] two_dim = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                two_dim[i][j] = scanner.nextInt();
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
                if(two_dim[i][j] == two_dim[j][i]){
                    sum+=two_dim[i][j];
                }
            }
        }
        System.out.println(sum);


    }
}
