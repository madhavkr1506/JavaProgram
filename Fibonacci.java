import java.util.Scanner;
public class Fibonacci {
    static void fibonacci(int num){
        if(num == 0){
            System.out.println(0);
        }
        else if(num == 1){
            System.out.println(0);
            System.out.println(1);
        }
        else{
            int a = 0;
            int b = 1;
            System.out.println(a);
            System.out.println(b);
            int i = 3;
            while(i<=num) {
                int c = a + b;
                System.out.println(c);
                a = b;
                b = c;
                i++;
            }

        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        fibonacci(10);

    }
}

