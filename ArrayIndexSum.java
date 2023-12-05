import java.util.Scanner;

public class ArrayIndexSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int[] array1=new int[num];
        int[] array2=new int[num];
        for(int i=0;i<num;i++){
            array1[i]=scanner.nextInt();
        }
        for(int i=0;i<num;i++){
            array2[i]=scanner.nextInt();
        }
        int position=scanner.nextInt();
        int sum=0;
        if(position < num){
            for(int i=0;i<num;i++){
                sum = array1[position] + array2[position];
            }
            System.out.println("Sum is = " + sum);
        }
        else{
            System.out.println("The input position is invalid.");
        }
    }
}
