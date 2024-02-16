public class Practice7 {

    public static void printarray(int[] array,int n){
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void bubblesort(int[] array,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            printarray(array, n);
        }
        
    }

    public static void selectionsort(int[] array,int n){
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
            printarray(array, n);
        }
        
    }

    public static void insertionsort(int[] array,int n){
        for(int i=1;i<n;i++){
            int temp = array[i];
            int j = i - 1;
            while(j>=0 && array[j] > temp){
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
            printarray(array, n);
        }
        
    }

    public static void main(String[] args) {
        int[] array = { 9, 5, 1, 4, 3 };
        int n = array.length;
        // bubblesort(array, n);

        // selectionsort(array, n);

        insertionsort(array, n);
    }
}
