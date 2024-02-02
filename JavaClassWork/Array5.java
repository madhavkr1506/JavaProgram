import java.util.ArrayList;
import java.util.List;

public class Array5 {
    public static List<Integer> function1(int[] array,int n){
        List<Integer> result = new ArrayList<>();
        if(n > 1){
            for(int i=1;i<n-1;i++){
                if(array[i] > array[i - 1] && array[i] > array[i + 1]){
                    result.add(array[i]);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = {11,15,14,19,18,17,16,12,13};
        int n = array.length;
        System.out.println(function1(array, n));
        
    }
}
