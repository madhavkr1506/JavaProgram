// write a program to check wheteher a number is perfect number or not?
// write a program to print all perfect number in the given range.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array29 {

    public static List<Integer> perfectnumber(int num1,int num2){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=num1;i<=num2;i++){
            int sum = 0;
            for(int j=1;j<=i;j++){
                if(i % j == 0 && i != j){
                    sum+=j;
                }
            }
            if(sum == i){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int num = scanner.nextInt();

        // int sum = 0;
        // for(int i=1;i<=num;i++){
        //     if(num % i == 0 && num != i){
        //         sum+=i;
        //     }
        // }
        // if(sum == num){
        //     System.out.println(num + " is a perfect number");
        // }
        // else{
        //     System.out.println(num + " is not a perfect number");
        // }


        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        List<Integer>perfectnumber = perfectnumber(num1, num2);
        if(perfectnumber.isEmpty()){
            System.out.println("There is no any perfect number in between given range");
        }
        for(int i : perfectnumber){
            System.out.println(i);
        }


        scanner.close();
    }
}
