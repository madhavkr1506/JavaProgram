// write a program to perform left rotation :

public class Array15 {
    public static void leftrotate(int[] array,int n,int times){
        int z=1;
        while(z<=times){
            int temp = array[0];
            for(int i=0;i<n-1;i++){
                array[i] = array[i+1];
            }
            array[n-1] = temp;
            z++;
        }
    }
    public static void printarray(int[] array,int n){
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int n = array.length;
        leftrotate(array, n,3);
        printarray(array, n);

    }
}
