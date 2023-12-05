import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students you want to enter = ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < num; i++) {
            String name = scanner.nextLine();
            System.out.println("Enter details of " + name);
            System.out.print("Math marks = ");
            float math = scanner.nextFloat();
            System.out.print("Science marks = ");
            float science = scanner.nextFloat();
            System.out.print("socialScience marks = ");
            float socialScience = scanner.nextFloat();
            float percentage = (math + science + socialScience) / 3;
            System.out.println("Percentage of " + name + " is " + percentage);
            scanner.nextLine();
            if (percentage > 90 && percentage < 100.1){
                System.out.println("Congratulation " + name + " is awarded with grade A+");
            }
            else if (percentage > 80 && percentage < 90.1){
                System.out.println("Congratulation " + name + " is awarded with grade A");
            }
            else if (percentage > 70 && percentage < 80.1){
                System.out.println("Congratulation " + name + " is awarded with grade B");
            }
            else if (percentage > 60 && percentage < 70.1){
                System.out.println("Congratulation " + name + " is awarded with grade C");
            }
            else {
                System.out.println("Congratulation " + name + " is awarded with Improvement course");
            }
        }


    }
}
