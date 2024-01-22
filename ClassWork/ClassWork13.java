// find peak element which is bigger than its neighbour

package ClassWork;

import java.util.Scanner;

public class ClassWork13 {
    public static int function(int[] array,int num){
        if(num == 1){
            return 0;
        }
        if(array[0] >= array[1]){
            return array[0];
        }
        if(array[num-1] >= array[num-2]){
            return array[num-1];
        }
        for(int i = 1;i < num - 1;i++){
            if(array[i] >= array[i - 1] && array[i] >= array[i + 1]){
                return array[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {11,15,16,14,12,19};
        int num = array.length;
//        System.out.println(num);
        System.out.println(function(array, num));
    }
}
