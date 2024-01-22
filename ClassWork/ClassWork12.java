package ClassWork;

import java.util.Scanner;

public class ClassWork12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();

//        this is first approach :

//        String[] name = new String[data];
//        int[] age = new int[data];
//        for(int i=0;i<data;i++){
//            name[i] = scanner.next();
//            age[i] = scanner.nextInt();
//        }
//        for(int i=0;i<data;i++){
//            if(age[i] >= 18){
//                System.out.println(name[i] + age[i] + " is eligible to vote");
//            }
//            else{
//                System.out.println(name[i] + age[i] + " is not eligible to vote");
//            }
//        }

//        this is second approach :
        String nameAge[] = new String[data];
        for(int i=0;i<data;i++){
            String name = scanner.next();
            String Age = scanner.next();
            nameAge[i] = (name + " --> " + Age);
        }
        for(int i=0;i<data;i++){
            String[] string = nameAge[i].split(" --> ");
            
            int age = Integer.parseInt(string[1]);

            if (age  > 18){
                System.out.println(string[0] + string[1] + " is eligible to vote");
            }
            else {
                System.out.println(string[0] + string[1] + " is not eligible to vote");
            }
        }
    }
}
