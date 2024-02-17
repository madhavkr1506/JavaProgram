// import java.util.Arrays;

public class Practice9 {

    public static int countdigit(int num){
        int count = 0;
        while(num != 0){
            num /= 10;
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
        // int num = 1234500;
        // String str = Integer.toString(num);
        // String string = new StringBuilder(str).reverse().toString();
        // System.out.println(Integer.parseInt(string));


        // String text = "Madhav kumar";
        // StringBuilder stringbuilder = new StringBuilder();
        // for(int i=text.length()-1;i>=0;i--){
        //     if(text.charAt(i) != ' '){
        //         stringbuilder.append(text.charAt(i));
        //     }
        // }
        // System.out.println(stringbuilder.toString());


        // int[] array = {11,19,14,18,15,16,12,17};
        // Arrays.sort(array);
        // System.out.println(Arrays.toString(array));
        // System.out.println(Arrays.stream(array).max().getAsInt());
        // System.out.println(Arrays.stream(array).min().getAsInt());

        // int Armnum = 370;
        // int temp = Armnum;
        // int res = 0;
        // int power = countdigit(Armnum);
        // while(Armnum != 0){
        //     int rem = Armnum % 10;
        //     res += (int)(Math.pow(rem,power));
        //     Armnum /= 10;
        // }

        // if(res == temp){
        //     System.out.println("Armstrong number");
        // }
        // else{
        //     System.out.println("Not a Armstrong number");
        // }

        // int num = 10;
        // boolean found = true;
        // for(int i=2;i<=Math.sqrt(num);i++){
        //     if(num % i == 0){
        //         found = false;
        //         break;
        //     }
        // }
        // if(found){
        //     System.out.println("Prime number");
        // }
        // else{
        //     System.out.println("Not a prime number");
        // }

        // int num1 = 2;
        // int num2 = 100;
        // for(int input = num1 ;input <= num2; input++){
        //     boolean found = true;
        //     for(int i=2;i<=Math.sqrt(input);i++){
        //         if(input % i == 0){
        //             found = false;
        //             break;
        //         }
        //     }
        //     if(found){
        //         System.out.println(input);
        //     }
        // }


        // System.out.println(factorial(5));

        // int num = 145;
        // int temp = num;
        // int res = 0;
        // while (num != 0) {
        //     int rem = num % 10;
        //     res += factorial(rem);
        //     num /= 10;
        // }
        // if(res == temp){
        //     System.out.println("Strong number");
        // }
        // else{
        //     System.out.println("Not a strong number");
        // }


        // int num = 12121;
        // int temp = num;
        // int rev = 0;
        // while(num != 0){
        //     int rem = num % 10;
        //     rev = (rev * 10) + rem;
        //     num /= 10;
        // }
        // if(rev == temp){
        //     System.out.println("Palindrome number");
        // }
        // else{
        //     System.out.println("Not a palindrome number");
        // }

        // int num = 81;
        // int odd = 1;
        // for(int i=2;i<num;i++){
        //     if(num % i == 0 && i % 2 != 0){
        //         odd = i;
        //     }
        // }
        // System.out.println(odd);
    }
}