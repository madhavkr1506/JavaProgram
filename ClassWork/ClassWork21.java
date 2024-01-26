package ClassWork;

import java.util.Scanner;

public class ClassWork21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//      here I tried to create an array  of size 3, and at each index of that array I tried to assign new array of same size : it will give an error because i have chosen a wrong way to do so.


//        int [] outerArray=new int[3];
//
//        for (int i = 0; i < 3; i++){
//            outerArray[i] = new int[3];
//        }


//      here is the right way to do this : assign new array to every index of outerArray

        int[][] outerArray = new int[3][3];  // here new int[3][] : in column portion i have assign value 3 makes it new int[3][3] but i updated it with new value i.e., at index 0 array of size 5 is assigned,and at index 1 array of size 6 is assigned, and same with index 2 array of size 7 is assigned.

        outerArray[0]=new int[5];
        outerArray[1]=new int[6];
        outerArray[2]=new int[7];

//        assign value to array at index 0 of outerArray
        outerArray[0][0]=1;
        outerArray[0][1]=1;
        outerArray[0][2]=1;
        outerArray[0][3]=1;
        outerArray[0][4]=1;
//        outerArray[0][5]=1;   // we are trying to assign value to the index out of bound : it will give error

//        printing value of array which is at index 0 of outerArray

        for (int i=0;i<outerArray[0].length;i++){
            System.out.print(outerArray[0][i] + " ");
        }

    }
}
