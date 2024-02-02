
import java.util.Arrays;
import java.util.HashSet;


public class Array6 {
    public static int function1(int[] array,int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(array[i] == array[j]){
                    return array[i];
                }
            }
        }
        return 0;
    }
    public static void function2(int[] array,int n){
        Arrays.sort(array);
        for(int i=1;i<n;i++){
            if(array[i] == array[i-1]){
                // return array[i];
                System.out.println(array[i]+" ");
            }
        }
        // return 0;
    }
    public static int function3(int[] array){
        HashSet<Integer>list = new HashSet<>();
        for(int x : array){
            if(!list.add(x)){
                return x;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] array = {11,15,14,18,19,17,16,12,15,12};
        int n = array.length;
        // System.out.println(function1(array, n));
        // System.out.println(function2(array, n));
        function2(array, n);
        // System.out.println(function3(array));
    }
}
