// import java.util.Arrays;

public class Practice8 {

    public static int factorial(int num){
        int fact = 1;
        int i=1;
        while(i<=num){
            fact*=i;
            i++;
        }
        return fact;
    }

    public static int countdigit(int num){
        int count = 0;
        while(num != 0){
            num /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {

        // print leap year

        // int num1 = 2000;
        // int num2 = 2024;
        // for(int year = num1; year <= num2; year++){
        //     if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
        //         System.out.println(year);
        //     }
        // }


        // check armstrong number

        // int num = 370;
        // int temp = num;
        // int sum = 0;
        // int count = 3;
        // while(num != 0){
        //     num /= 10;
        //     count++;
        // }
        // System.out.println(count);

        // while(num != 0){
        //     int rem = num % 10;
        //     sum += (int)(Math.pow(rem,count));
        //     num /= 10;
        // }

        // if(sum == temp){
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("No");
        // }


        // Strong number

        // int num = 145;
        // int temp = num;
        // int sum = 0;
        

        // while(num != 0){
        //     int rem = num % 10;
        //     sum += factorial(rem);
        //     num /= 10;
        // }

        // if(sum == temp){
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("No");
        // }

        // palindrome number : 
        // int num = 121;
        // int temp = num;
        // int res = 0;
        // while(num != 0){
        //     int rem = num % 10;
        //     res = (res * 10) + rem ;
        //     num /= 10;
        // }
        // if(res == temp){
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("No");
        // }

        // reverse a number

        // int num = 1232006700;
        // String str = Integer.toString(num);
        // String string = new StringBuilder(str).reverse().toString();
        // System.out.println(Integer.parseInt(string));

        // print max and min from array

        // int array[] = {5,6,8,3,5,7};
        // System.out.println(Arrays.stream(array).max().getAsInt());
        // System.out.println(Arrays.stream(array).min().getAsInt());


        // reverse String

        String str = "Madhav kumar";
        // String rev = new StringBuilder(str).reverse().toString();
        // System.out.println(rev);

        StringBuilder rev = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                rev.append(str.charAt(i));
            }
        }
        System.out.println(rev.toString());



        
    }
}