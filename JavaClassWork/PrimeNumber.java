import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write a program to print all prime number in the given range:

        // int num1 = scanner.nextInt();
        // int num2 = scanner.nextInt();
        
        // for(int i=num1;i<=num2;i++){
        //     boolean found = true;
        //     for(int j=2;j<i/2;j++){
        //         if(i % j == 0){
        //             found = false;
        //         }
        //     }
        //     if(found){
        //         System.err.println(i);
        //     }
        // }

        // write a program to print reverse of a number :

        // int num = scanner.nextInt();
        // int rev = 0;
        // while(num != 0){
        //     int rem = num % 10;
        //     rev = rev * 10 + rem;
        //     num = num / 10;
        // }
        // System.out.println(rev);


        // write a program to print square of digit of a number : 

        int num = scanner.nextInt();
        int power = 1;
        int sum = 0;
        while(num != 0){
            int rem = num % 10;
            int square = rem * rem;
            sum = square * power + sum;
            power*=10;
            if(square > 10){
                power*=10;
            }
            num/=10;

        }
        System.out.println(sum);

        

    scanner.close();
    }
}
