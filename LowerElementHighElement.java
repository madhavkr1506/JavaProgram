import java.util.Scanner;

public class LowerElementHighElement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int[] array1=new int[num];
        for(int i=0;i<num;i++){
            array1[i]=scanner.nextInt();
        }
        System.out.print("Index of the element is = " + purify(array1,num));

    }

    static boolean check(int[] array,int num,int index){
        int i=index - 1;
        int j=index + 1;
        while( i >= 0){
            if(array[i] > array[index]){
                return false;
            }
            i--;
        }
        while(j < num){
            if(array[j] < array[index]){
                return false;
            }
            j++;
        }
        return true;
    }
    static int purify(int[] array,int num){
        for(int i=1;i<num-1;i++){
            if(check(array,num,i)){
                return i;
            }
        }
        return -1;
    }

}
