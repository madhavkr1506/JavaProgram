// Write a program to reverse an array : 

public class Reverse {
    public static int[] function1(int[] array){
        int n = array.length;
        int[] array2 = new int[n];
        for(int i=n-1;i>=0;i--){
            array2[i] = array[n-1-i];
        }
        return array2;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] temp = function1(array);
        for(int element : temp){
            System.out.println(element);
        }
    }
}
