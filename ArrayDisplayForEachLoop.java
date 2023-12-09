import java.util.Scanner;
public class ArrayDisplayForEachLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array1 = {"madhav","rahul","krishna","amit"};
//        for(int i=0;i< array1.length;i++){
//            array1[i]=scanner.next();
//        }
        for(String element : array1){
            System.out.println(element);
        }
    }
}
