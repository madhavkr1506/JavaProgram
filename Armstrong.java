import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        armstrong(num);
    }
    static void armstrong(int num){
        int temp=num;
        int rem;
        int n=countDigit(num);
        int result=0;
        while(num != 0){
            rem=num % 10;
//            result += rem * rem * rem;
            result += Math.pow(rem,n);
            num /= 10;
        }
        if(temp == result){
            System.out.println(temp + " is an armstrong number.");
        }
        else{
            System.out.println(temp + " is not an armstrong number.");
        }

    }
    static int countDigit(int num){
        int count = 0;
        while(num != 0){
            num /= 10;
            count++;
        }
        return count;
    }
}
