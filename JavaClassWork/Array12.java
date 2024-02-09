import java.util.Scanner;

public class Array12 {
    public static int function1(int[] array,int num,int low,int high, int found){
        int mid = (low + high) / 2;
        if(array[mid] == found){
            return mid;
        }
        else{
            if(low > high){
                return -1;
            }
            if(array[mid] > found){
                return function1(array, num, low, mid - 1, found);
            }
            else{
                return function1(array, num, mid + 1, high, found);
            }
        }

    }

    public static void leftRotate(int[] array,int num){
        int packet = array[0];
        
        for(int i=0;i<num-1;i++){
            array[i] = array[i+1];
        }

        array[num - 1] = packet;

        packet = array[0];
        for(int i=0;i<num-1;i++){
            array[i] = array[i+1];
        }
        array[num - 1] = packet;
    }

    public static void rightRotate(int[] array,int num){
        int packet = array[num - 1];
        
        for(int i=num-1;i>0;i--){
            array[i] = array[i-1];
        }

        array[0] = packet;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];
        
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }

        // int findEle = scanner.nextInt();
        
        // for (int i = 0; i < num; i++) {
        //     if(array[i] == findEle){
        //         System.out.println(i);
        //     }
        // }

        // System.out.println(function1(array, num, 0, num-1, findEle));

        // leftRotate(array, num);

        rightRotate(array, num);

        for (int i = 0; i < num; i++) {
            System.out.print(array[i]+" ");
        }

        
        scanner.close();
    }
}

/*
 * https://leetcode.com/problems/search-in-rotated-sorted-array/description/
 */