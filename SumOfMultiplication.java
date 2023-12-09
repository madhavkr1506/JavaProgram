import java.util.Scanner;

public class SumOfMultiplication {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
//            System.out.println(num * i);
            sum += num*i;

        }
        System.out.println(sum);
    }
}
