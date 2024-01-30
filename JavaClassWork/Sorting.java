public class Sorting {
    public static void main(String[] args) {
        int[] array = {11,15,14,16,18,17,19,9,4,6};
        int n = array.length;

        // this is bubble sort : 
        // for(int i=0;i<n-1;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         if(array[j]>array[j+1]){
        //             int temp = array[j];
        //             array[j] = array[j+1];
        //             array[j+1] = temp;
        //         }
        //     }
        // }
        // for(int element : array){
        //     System.out.print(element+" ");
        // }
        // System.out.println();

        // this is selection sort : 

        // for(int i=0;i<n-1;i++){
        //     int min = i;
        //     for(int j = i+1;j<n;j++){
        //         if(array[j] < array[min]){
        //             min = j;
        //         }
        //     }
        //     if(min != i){
        //         int temp = array[min];
        //         array[min] = array[i];
        //         array[i] = temp;
        //     }
        // }
        // for(int element : array){
        //     System.out.print(element+" ");
        // }
        // System.out.println();

        // this is insertion sort : 

        for(int i=1;i<n;i++){
            int temp = array[i];
            int j = i - 1;
            while (j>=0 && array[j] > temp) {
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }

        for(int element : array){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
