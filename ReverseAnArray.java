import java.util.Scanner;


public class ReverseAnArray {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5,6,7};
        reverse(array1,array1.length);
        for(int element : array1){
            System.out.print(element + " ");
        }


    }
    static void reverse(int[] array, int num){
        for(int i=0;i<num/2;i++){
            int temp=array[i];
            array[i]=array[num-1-i];
            array[num-1-i]=temp;
        }

    }
}
