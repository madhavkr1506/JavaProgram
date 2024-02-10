// write a program to print first and last position of element in the sorted array : 

public class Array20 {
    public static int[] printposition(int[] array,int target){
        int len = array.length;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        int first = -1;
        int second = -1;
        for(int i=0;i<len;i++){
            if(array[i] == target){
                first = i;
                break;
            }
        }

        if(first == -1){
            return new int[] {-1,-1};
        }

        for(int i=len-1;i>=0;i--){
            if(array[i] == target){
                second = i;
                break;
            }
        }
        return new int[] {first,second};
    }
    public static void main(String[] args) {
        int[] array = {1,3,4,6,8,6,3,2,7};
        int target = 11;
        int[] result = printposition(array, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
