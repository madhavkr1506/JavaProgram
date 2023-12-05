import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array1=new int[num];
        int[] array2=new int[num];
        for(int i=0;i<num;i++){
            array1[i]=scanner.nextInt();
        }
        int delete=scanner.nextInt();
        for(int i=0;i<num;i++){
            if(array1[i]==delete){
                array2[i++]=delete;
            }
            System.out.print(array1[i] + " ");
        }
    }
}
