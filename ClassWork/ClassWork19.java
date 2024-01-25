package ClassWork;

import java.util.Scanner;

public class ClassWork19 {
    static int function1(int[] array,int num){
        int low = 0;
        int high = num - 1;
        int mid = 0;
        while (low <= high){
            mid = (low+high) >> 1;
            if((mid == 0 || array[mid - 1] <= array[mid]) && (mid == num - 1 || array[mid + 1] <= array[mid])){
                break;
            }
            if(mid > 0 && array[mid - 1] > array[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return array[mid];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] array1 = new int[num];

        for(int i=0;i<num;i++){
            array1[i] = scanner.nextInt();
        }

        for(int i=0;i<num;i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println();

        System.out.println(function1(array1,num));


    }
}
