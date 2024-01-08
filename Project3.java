//import java.util.Scanner;
//
//public class Project3 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] array=new int[7];
//        System.out.println("Enter array element : ");
//        for(int i=0;i<7;i++){
//            array[i]= scanner.nextInt();
//        }
//        System.out.println("Enter index : ");
//        int index = scanner.nextInt();
//        System.out.println("Enter num to divide : ");
//        int num = scanner.nextInt();
//        try{
//            System.out.println("Element at index " +index+" is "+array[index]);
//            System.out.println("Required result is  " + array[index] + " / " + num + " : " + (array[index] / num));
//        }
//        catch (ArrayIndexOutOfBoundsException a){
//            System.out.println(a.getMessage());
//            System.out.println(a);
//        }
//        catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//            System.out.println(e);
//        }
//        catch (Exception i){
//            System.out.println(i);
//        }
//    }
//}


import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] array = new float[7];

        System.out.println("Enter array elements (float): ");
        for (int i = 0; i < 7; i++) {
            array[i] = scanner.nextFloat();
        }

        System.out.println("Enter index: ");
        int index = scanner.nextInt();

        System.out.println("Enter number to divide: ");
        float num = scanner.nextFloat();

        try {
            System.out.println("Element at index " + index + " is " + array[index]);
            System.out.println("Required result is " + array[index] + " / " + num + " : " + (array[index] / num));
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("ArrayIndexOutOfBoundsException: " + a.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (Exception i) {
            System.out.println("Exception: " + i.getMessage());
        }
    }
}
