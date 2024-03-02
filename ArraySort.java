import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {11,34,23,54,46,23,13,16,57,37};
        int halfsize = array.length/2;
        Arrays.sort(array,0,halfsize);
        Arrays.sort(array,halfsize,array.length);
        System.out.println(Arrays.toString(array));
    }
}
