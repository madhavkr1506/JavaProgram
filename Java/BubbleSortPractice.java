public class BubbleSortPractice {
    public static void printarray(int[] array,int n){
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {17,15,16,19,18};
        int n = array.length;
        System.out.println("array before sorting");
        printarray(array, n);

        System.out.println("array after sorting");
        

        for(int i=0;i<n-1;i++){
            for(int j=0; j<n-i-1;j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                
            }
            
        }
        printarray(array, n);
    }
}
