import java.util.Scanner;

public class LeftRotateArray {

    public static void leftRotate(int[] array){
        int first = array[0];
        for(int i=0;i<array.length - 1;i++){
            array[i] = array[i + 1];
        }
        array[array.length - 1] = first;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {1,2,3,4,5};
        int n = array.length;


        // code for : when we have to rotate for one times/ one space

        // int first = array[0];
        // for(int i=0;i<n-1;i++){
        //     array[i] = array[i + 1];
        // }
        // array[n - 1] = first;

        // code for : when we have to rotate for d times/ d spaces

        System.out.println("input number of times you want to rotate : ");
        int times = sc.nextInt();

        times = times % n;

        for(int i=0;i<times;i++){
            leftRotate(array);
        }


        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        

        sc.close();
    }
}