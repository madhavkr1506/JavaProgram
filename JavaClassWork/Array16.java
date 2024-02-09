// write a program to perform right rotation :

public class Array16 {
    public static void printarray(int[] array,int n){
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void rightrotate(int[] array,int n,int times){
        int i=1;
        while(i<=times){
            int temp = array[n-1];
            for(int j=n-1;j>0;j--){
                array[j] = array[j-1];
            }
            array[0] = temp;
            i++;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int n = array.length;

        rightrotate(array, n, 3);
        printarray(array, n);

    }
}
