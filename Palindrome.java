import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        reverse(num);

    }
    static void reverse(int num){
        int temp=num;
        int rev=0;
        int rem;
        while(num!=0){
            rem=num%10;
            rev=(rev * 10) + rem;
            num=num / 10;
        }
//        return rev;
        if(temp == rev){
            System.out.println(rev + " is a palindrome number.");
        }
        else{
            System.out.println(rev + " is not a palindrome number.");
        }
    }
}
