import java.util.Scanner;

public class Array31 {
    public static int power(int num){
        int count=0;
        while(num != 0){
            num /= 10;
            count++;
        }
        return count;
    }

    public static void armstrongnumber(int num){
        int digit = power(num);
        int temp = num;
        int res = 0;
        while(num != 0){
            int rem = num % 10;
            res = (int) (res + Math.pow(rem,digit));
            num /= 10;
        }
        if(res == temp){
            System.out.println(temp + " is an armstrong number");
        }
        else{
            System.out.println(temp + " is not an armstrong number.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        armstrongnumber(num);
        scanner.close();
    }
}
