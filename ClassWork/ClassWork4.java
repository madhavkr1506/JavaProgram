package ClassWork;
import java.util.*;

public class ClassWork4 {
    public static int[] function1(int[] array){
        if(array.length == 0){
            return new int[] {};
        }
        else if(array.length == 1){
            return new int[] {array[0]};
        }
        else{
            return array;
        }
    }

    public static String function2 (int [] array){
        if(array.length == 0){
            return "There is an empty array";
        }
        else if(array.length==1){
            return Arrays.toString(array);
        }
        else{
            return Arrays.toString(array);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array1 = new int[num];
        for(int i=0;i<num;i++){
            array1[i]=scanner.nextInt();
//            System.out.print(array1[i] + ' '); // --> It will not print exact value because it will add (integer + ascii value of ' ' which is 32)
        }
//        for(int i=0;i<num;i++){
//            System.out.print(array1[i] + " "); // --> It will print exact value which is store in an array.
//        }

//        int[] result = function1(array1);
//        for(int i=0;i< result.length;i++){
//            System.out.print(result[i]+" ");
//        }

        System.out.println(function2(array1));




    }
}
