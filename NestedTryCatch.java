import java.util.Scanner;

class TryCatchNested{
    Scanner scanner = new Scanner(System.in);
    public void function1(int[] array,int num){
        for(int i=0;i<num;i++) {
            array[i] = scanner.nextInt();
        }
    }
    public void function2(int[] array,int num){
        for(int i=0;i<num;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public void function3(int[] array,int index,int number){
        try{
            System.out.println("Welcome to Nested try and catch : ");
            try {
                System.out.println("Element at " + index + " is " + array[index]);
                System.out.println("Required result is " + (array[index] / number));
            }
            catch (ArrayIndexOutOfBoundsException A){
                System.out.println("ArrayIndexOutOfBoundsException has occurred.");
                System.out.println("This is second level.");
                System.out.println(A);
            }
        }
        catch (Exception e){
            System.out.println("Some other error has occurred.");
            System.out.println("This is first level.");
            System.out.println(e);
        }
    }

}
public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of inputs you want to insert = ");
        int num=scanner.nextInt();
        int[] array1 = new int[num];
        TryCatchNested t1 = new TryCatchNested();
        System.out.println("Enter Element = ");
        t1.function1(array1,num);
        System.out.println("Elements in the array are = ");
        t1.function2(array1,num);
        System.out.println("Perform action = ");
        System.out.println("Enter index = ");
        int index = scanner.nextInt();
//        System.out.println("Element at " + index + " is " + array1[index]);   ---> It may throw an error because : no exception handling.
        System.out.println("Enter number = ");
        int number = scanner.nextInt();
        t1.function3(array1,index,number);

    }
}
