// write a program to find first smallest missing positive integer

import java.util.Arrays;

public class Array18 {
    public static void main(String[] args){
        int[] array = {1,4,5,6,3,9,8};
        int n = array.length;

        Arrays.sort(array);
        
        int smallest = 1;
        for(int i=0;i<n;i++){
            if(array[i] <= 0){
                continue;
            }
            if(array[i] == smallest){
                smallest++;
            }
        }
        System.out.println(smallest);
    }
}
