// Write a java program for matrix implementation

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int [][] two_dim = new int[num][num];

        int [][] transposeMatrix = new int[num][num];

        // taking elements inside matrix
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                two_dim[i][j] = scanner.nextInt();
            }
        }

        // copying elements of two_dim matrix to the transpose of matrix
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                transposeMatrix[j][i] = two_dim[i][j];
            }
        }

        // printing original matrix

        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print(two_dim[i][j]+" ");
            }
            System.out.println();
        }

        // printing transpose matrix 
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // matrix multiplication
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                int sum = 0;
                for(int k=0;k<num;k++){
                    sum+=two_dim[i][k] * transposeMatrix[k][j];
                }
                System.out.print(sum+" ");
            }
            System.out.println();
        }

        // printing primary diagonal elements
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(two_dim[i][j] == two_dim[j][i]){
                    System.out.print(two_dim[i][j]+" ");
                }
            }
        }
        System.out.println();

        // printing primary diagonal elements 
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(two_dim[j][i] == two_dim[i][j]){
                    System.out.print(two_dim[i][j]+" ");
                }
            }
        }
        System.out.println();

        // printing primary diagonal elements
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(i==j){
                    System.out.print(two_dim[i][j]+" ");
                }
            }
        }
        System.out.println();

        // printng secondary diagonal elements
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if((i + j) == (num - 1)){
                    System.out.println(two_dim[i][j]+" ");
                }
            }
        }
        System.out.println();
        scanner.close();
    }
}
