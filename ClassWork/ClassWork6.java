// Note : write a code for pairing array element : 

import java.util.Arrays;
import java.util.Scanner;

public class ClassWork6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] Array = new int[num];
        for(int i=0;i<Array.length;i++){
            Array[i] = scanner.nextInt();
        }
        for (int i=0;i<Array.length;i++){
            System.out.print(Array[i] + " ");
        }
        System.out.println();
        for(int i=0;i<Array.length;i+=2){
            if(i + 1 < Array.length) {
                int[] subArray = {Array[i], Array[i + 1]};
                String string = Arrays.toString(subArray);
                System.out.print(string + " ");
            }
            else{
                int [] newSubArray = {Array[i]};
                String newString = Arrays.toString(newSubArray);
                System.out.print(newString + " ");
            }
        }
    }
}
