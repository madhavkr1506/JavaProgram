import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println("Reverse of the num is = "+reverse(num));

    }
    static int reverse(int num){
        int rev=0;
        int rem;
        while(num!=0){
            rem=num%10;
            rev=(rev * 10) + rem;
            num=num / 10;
        }
        return rev;
    }
}
