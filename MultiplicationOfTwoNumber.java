import java.util.Scanner;

public class MultiplicationOfTwoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number = ");
        int num2 = scanner.nextInt();

        int digit1 = num1 / 10;
        int digit2 = num1 % 10;

        int digit3 = num2 / 10;
        int digit4 = num2 % 10;

        int process1 = digit2 * digit4;
        int process2 = digit1 * digit4;
        int process3 = digit2 * digit3;
        int process4 = digit1 * digit3;

        int multiplication = process1 + (process2 * 10) + (process3 * 10) + (process4 * 100);
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is : " + multiplication);
    }
}
