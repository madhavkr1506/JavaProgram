import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int[] array=new int[num];
        for(int i=0;i<num;i++){
            array[i]=scanner.nextInt();
        }
        int[] result=sumArray(array,9);
        if(result != null){
            System.out.println("["+result[0]+","+result[1]+"]");
        }
        else{
            System.out.println("No such pair found here");
        }

    }
    public static int[] sumArray(int[] num, int target){
        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                if((num[i] + num[j]) == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
