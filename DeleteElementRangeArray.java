import java.util.Scanner;

public class DeleteElementRangeArray {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int[] array1=new int[num];
        int[] array2=new int[num];
        int index=0;
        for(int i=0;i<num;i++){
            array1[i]=scanner.nextInt();
        }
        int minrange=scanner.nextInt();
        int maxrange=scanner.nextInt();

        for(int i=0;i<num;i++){
            if(array1[i] >= minrange && array1[i] <= maxrange){
                array2[index++]=array1[i];
//                This is also done with the help of continue
                
//                continue;
            }
            else {
                System.out.print(array1[i] + " ");
            }
        }

//        This part will elements that you have deleted or the elements that comes in the range and you have moved it into array2

//        for(int i=0;i<index;i++){
//            System.out.print(array2[i] + " ");
//        }
    }
}
