import java.util.Arrays;
import java.util.Scanner;

public class ArraysFunction {

    public static int countNum(int num){
        int count = 0;
        while(num!=0){
            num/=10;
            count++;
        }
        return count;
    }

    public static int factorial(int num){
        int fact = 1;
        int i = 1;
        while(i<=num){
            fact *= i;
            i++;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {15,14,-18,17,-19,20,20,-1,56,-14};
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.stream(array).max().getAsInt());
        System.out.println(Arrays.stream(array).min().getAsInt());
        

        // int num = sc.nextInt();
        // int temp = num;
        // int sum = 0;
        // int count = countNum(num);
        // while(num != 0){
        //     int rem = num % 10;
        //     sum += (int) Math.pow(rem,count);
        //     num/=10;
        // }
        // if(sum == temp){
        //     System.out.println("Armstrong number");
        // }
        // else{
        //     System.out.println("Not a Armstrong number");
        // }

        

        // int num = sc.nextInt();
        // int temp = num;
        // int sum = 0;
        // while(num != 0){
        //     int rem = num % 10;
        //     sum+=factorial(rem);
        //     num /= 10;
        // }
        // if(sum == temp){
        //     System.out.println("It is a strong number");
        // }
        // else{
        //     System.out.println("It is not a strong number");
        // }


        // int num = sc.nextInt();
        // int temp = num;
        // int rev = 0;
        // while(num != 0){
        //     int rem = num % 10;
        //     rev = (rev * 10) + rem;
        //     num /= 10;
        // }
        // if(temp == rev){
        //     System.out.println("Pallindrome number");
        // }
        // else{
        //     System.out.println("Not a palindrome number");
        // }


        // int num = sc.nextInt();
        // String str1 = Integer.toString(num);
        // String string = new StringBuilder(str1).reverse().toString();
        // System.out.println(string);

        
        sc.close();

    }
}