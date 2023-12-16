import java.util.Scanner;

public class SpecificException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int num = scanner.nextInt();
        int[] array1 = new int[num];
        System.out.println("Enter array elements = ");
        for(int i=0;i<num;i++){
            array1[i]=scanner.nextInt();
        }
        for(int i=0;i<num;i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the index = ");
        int index = scanner.nextInt();
        System.out.println("Enter number = ");
        int number = scanner.nextInt();
        try{
            System.out.println("Element at index " + array1[index]);
            System.out.println("Result " + array1[index] + " / " + number + " is " + (array1[index]/number));
        }
        catch (ArithmeticException A){
            System.out.println("ArithmeticException occurred : ");
            System.out.println(A);
        }
        catch (ArrayIndexOutOfBoundsException I){
            System.out.println("ArrayIndexOutOfBoundsException occurred : ");
            System.out.println(I);
        }
        catch (Exception e){
            System.out.println("Some other exception occurred : ");
            System.out.println(e);
        }
    }
}
