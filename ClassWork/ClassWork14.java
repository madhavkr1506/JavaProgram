package ClassWork;

import java.util.Scanner;

public class ClassWork14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        java - parseInt() Method

//        Description : this method is used to get the primitive data type of a certain String. parseXxx() is a static method and can have one argument or two.

//        syntax :

//        static int parseInt(String s)  s --> this is a string representation of decimal.
//        static int parseInt(String s, int radix) radix --> this would be used to convert String s into integer.


//        return value : parseInt(String s) --> this return s an integer (decimal only)
//        parseInt(int i) --> this returns an integer(decimal only).
//        given a string representation of decimal, binary, octal,hexadecimal (radix equals 10, 2, 8 or 16) respectively numbers as input.

//        Multidimensional arrays : two-dimensional array
        int[][] two_dim = new int[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0;j < 3;j++){
                two_dim[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                System.out.print(two_dim[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(two_dim.length); // -->the length variable is applicable to an array but not for string objects whereas the length() method is applicable for string objects but not for arrays.

//      Transpose of two-dimensional array :

        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 3;j++){
                System.out.print(two_dim[j][i] + " ");
            }
            System.out.println();
        }

//      The multiplication of two-dimensional array with its transpose :

        for (int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                int sum = 0;
                for (int k = 0;k < 3;k++){
                    sum+=two_dim[i][k] * two_dim[j][k];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
