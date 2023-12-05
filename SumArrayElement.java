import java.util.Scanner;
public class SumArrayElement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int[] array1=new int[num];
        int[] array2=new int[num];
        int[] array3=new int[num];
        for(int i=0;i<num;i++){
            array1[i]=scanner.nextInt();
        }
        scanner.nextLine();
        for(int i=0;i<num;i++){
            array2[i]=scanner.nextInt();
        }
        for(int i=0;i<num;i++){
            array3[i]=array1[i] + array2[i];
            System.out.print(array3[i]+" ");
        }
    }
}
