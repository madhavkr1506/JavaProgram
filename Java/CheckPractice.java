import java.util.Scanner;

public class CheckPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        // System.out.println("Armstronge");
        // for(int i=num1;i<num2;i++){
        //     int temp = i;
        //     int sum = 0;
        //     int power = count(i);
        //     int rem;
        //     while(temp != 0){
        //         rem = temp % 10;
        //         sum += (int)Math.pow(rem,power);
        //         temp /= 10;

        //     }
        //     if(i == sum){
                
        //         System.out.println(i);
        //     }
        // }

        // System.out.println("Palindrome");
        // for(int i=num1;i<num2;i++){
        //     int temp = i;
        //     int rev = 0;
        //     while(temp != 0){
        //         int rem = temp % 10;
        //         rev = (rev * 10) + rem;
        //         temp /= 10;
        //     }
        //     if(rev == i){
                
        //         System.out.println(i);
        //     }
        // }

        // String str1 = Integer.toString(num1);
        // StringBuilder revString = new StringBuilder(str1);
        // System.out.println(revString.reverse());


        // System.out.println("perfect");
        
        // for(int i=num1;i<num2;i++){
        //     int sumPerfect = 0;
        //     for(int j=1;j<i;j++){
        //         if(i % j == 0){
        //             sumPerfect+=j;
        //         }
        //     }
        //     if(sumPerfect == i){
        //         System.out.println(i);
        //     }
        // }

        System.out.println("prime number");
        for(int i=num1;i<num2;i++){
            int temp = i;
            boolean found = true;
            for(int j=2;j<=Math.sqrt(temp);j++){
                if(temp % j == 0){
                    found = false;
                    break;
                }
            }
            if(found){
                System.out.println(i);
            }
        }
        sc.close();
    }
    // public static int count(int num){
    //     int digit = 0;
    //     while(num != 0){
    //         num /= 10;
    //         digit++;
    //     }
    //     return digit;
    // }

    
}
