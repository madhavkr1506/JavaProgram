import java.util.Scanner;
import java.util.Arrays;
public class RemoveDuplicateElementArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();
        int[] array1=new int[num];

        for(int i=0;i<num;i++){
            array1[i]=scanner.nextInt();
        }
        Arrays.sort(array1);
        boolean duplicate;

        for(int i=0;i<num;i++){
            duplicate=false;
            for(int j=0;j<i;j++){
                if(array1[i]==array1[j]){
                    duplicate=true;
                    break;
                }
            }
            if(!duplicate) {
                System.out.print(array1[i] + " ");
            }
        }

    }
}
