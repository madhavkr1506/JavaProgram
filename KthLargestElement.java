
import java.util.Scanner;

public class KthLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int[] array1=new int[num];
        for(int i=0;i<num;i++){
            array1[i]=scanner.nextInt();
        }
        int pos= scanner.nextInt();
        findKthLargestElement(array1,num,pos);
        for(int element : array1){
            System.out.print(element + " ");
        }

    }
    static void findKthLargestElement(int[] array,int num,int position){
        for(int i=0;i<num-1;i++){
            for(int j=0;j<num-i-1;j++){
                if(array[j] > array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println(array[num-position]);
    }
}
