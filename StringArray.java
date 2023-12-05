import java.util.Scanner;

public class StringArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        String[] array1=new String[num];
        String[] array2=new String[num];
        String[] array3=new String[num];
        for(int i=0;i<num;i++){
            array1[i]=scanner.next();
        }
        scanner.nextLine();
        for(int i=0;i<num;i++){
            array2[i]=scanner.next();
        }
        scanner.nextLine();
        for(int i=0;i<num;i++){
            array3[i]=array1[i] + " " + array2[i];
        }
        for(int i=0;i<num;i++){
            System.out.print(array3[i] + " ");
        }
    }
}
