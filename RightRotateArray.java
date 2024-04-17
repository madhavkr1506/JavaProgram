import java.util.Scanner;

public class RightRotateArray {

    public static void rightRotate(int[] array){
        int last = array[array.length - 1];
        for(int i = array.length - 1; i >= 1; i--){
            array[i] = array[i - 1];
        }
        array[0] = last;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,3,4,5};
        int n = array.length;

        // you have to rotate it for one times

        // rightRotate(array);

        // you have to rotate it for d times

        System.out.println("Enter input how many times you want to rotate it : ");
        int times = sc.nextInt();

        times = times % n;

        for(int i=0;i<times;i++){
            rightRotate(array);
        }

        for(int i=0;i<n;i++){
            System.out.print(array[i] + " ");
        }
        
        sc.close();
    }
}
