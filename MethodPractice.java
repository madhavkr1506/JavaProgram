import java.util.Scanner;

public class MethodPractice {
    void multiplication(int num){
        int i=1;
        while(i<=10){
            System.out.println(num*i);
            i++;
        }
    }

    void pattern(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    int sumofnaturalno(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }
        else{
            return num + sumofnaturalno(num - 1);
        }
    }


    void pattern2(int num){
        for(int i=num;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    void fibonacci(int num){
        if(num == 0){
            System.out.println(0);
        }
        else if(num == 1){
            System.out.println(0);
            System.out.println(1);
        }
        else {
            int a = 0;
            int b = 1;
            System.out.println(a);
            System.out.println(b);
            int i = 3;
            while (i <= num) {
                int c = a + b;
                System.out.println(c);
                a = b;
                b = c;
                i++;
            }
        }
    }

    void average(float ...array){
        float total=0;
        int count=0;
        for(float element : array){
            total+=element;
            count++;
        }
        float average = total/count;
        System.out.println(average);
    }

    void pattern_rec(int num){
        if(num > 0){
//            pattern_rec(num -1);
            for(int i=0;i<num;i++){
                System.out.print("*" + " ");
            }
            System.out.println();

            pattern_rec(num -1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int num = scanner.nextInt();
        MethodPractice object1 = new MethodPractice();
//        object1.multiplication(num);
//        object1.pattern(num);
//        int c = object1.sumofnaturalno(num);
//        System.out.println(c);
//        object1.pattern2(num);
//        object1.fibonacci(num);
//        float[] array1={1,2,3,4,5};
//        object1.average(array1);
        object1.pattern_rec(num);

    }

}
