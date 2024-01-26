// Write a program in java to perform character matrix multiplication

package ClassWork;

import java.util.Scanner;

public class ClassWork22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] chars = new char[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                chars[i][j] = scanner.next().charAt(0);
            }
        }

        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(chars[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                StringBuilder stringBuilder = new StringBuilder();
                for(int k=0;k<3;k++){
                    stringBuilder.append(chars[i][k]);
                    stringBuilder.append(chars[k][j]);
                }
                System.out.print(stringBuilder.toString() + " ");
            }
            System.out.println();
        }
    }
}
