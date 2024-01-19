import java.util.Scanner;

public class ClassWork5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        long a = 123456789987564258L;
//        System.out.println((double) a); // --> It will not print exact value
//        System.out.println((float) a); // -->It will not print exact value
//        int input = scanner.nextInt();
//        if(((char)input >= 'A' && (char)input <= 'Z') || ((char)input >= 'a' && (char)input <= 'z')){
//            System.out.println((char)input);
//        }

//        Write a program that print alphabet in the given range (start with 1 and end with 26)
        int start = scanner.nextInt();
        int last = scanner.nextInt();
        for(int i=64 + start;i<=last;i++){
            System.out.print((char)i + " ");
        }

    }
}
