// write a program in java : print sum of consecutive elements of an array
package ClassWork;
import java.util.Scanner;

public class ClassWork7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] Array = new int[num];
        for (int i = 0;i < num;i++){
            Array[i] = scanner.nextInt();
        }
        for (int i = 0;i < num;i++){
            System.out.print(Array[i]+" ");
        }
        System.out.println();

        int sum = 0;

        for (int i = 0;i < num;i++){
            if(i + 1 < Array.length) {
                sum += Array[i] + Array[i + 1];
                System.out.print(sum+" ");
                sum = 0;
            }
        }
    }
}
