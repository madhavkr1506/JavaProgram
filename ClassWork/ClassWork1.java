package ClassWork;
import java.util.*;
public class ClassWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = "Madhav";
        for(int i=0;i<string1.length();i++){
            if(string1.charAt(i) == 'M'){
                continue;
            }
            System.out.print(string1.charAt(i) + " ");
        }

        char array[] = string1.toCharArray();
        for(int i=0;i<string1.length()-1;i++){
            char temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        String string2 = new String(array);
        System.out.println(string2);


//        for(int i=0;i<string1.length()-1;i+=2){
//            char temp = array[i];
//            array[i] = array[i + 1];
//            array[i + 1] = temp;
//        }
//        String string2 = new String(array);
//        System.out.println(string2);

//        -->  Class Activity :
        int num1 = scanner.nextInt();
        System.out.println(num1);
        int num2 = scanner.nextInt();
        System.out.println(num2);
        int num3 = scanner.nextInt();
        System.out.println(num3);

//        product of num1, num2, num3
        System.out.println(num1 * num2 * num3);

//        take double data type input and print it
        double num4 = scanner.nextDouble();
        System.out.println(num4);

//        print ascii value of a character
        char c = scanner.next().charAt(0);
        System.out.println(((int) c)); // typecasting


    }
}
