import java.util.Scanner;
public class ArrayPeek {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int[] array1=new int[num];
        for(int i=0;i<num;i++){
            array1[i]= scanner.nextInt();
        }
        System.out.println("Element whose neighbour are having low value = " + findNeighbourLarge(array1,num));

    }
    static int findNeighbourLarge(int[] array, int num){
        int  low=0;
        int high=num-1;
        int mid=0;
        while(low <= high){
            mid = (low + high) >> 1;
            if((mid == 0 || array[mid - 1] <= array[mid]) && (mid == num - 1 || array[mid + 1] <= array[mid])){
                break;
            }
            if(mid > 0 && array[mid - 1] > array[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return array[mid];
    }

}
