// write a quick sort program : 

public class Practice5 {
    public static int quick(int[] array,int low,int high){
        int pivot = array[high];
        int i = low - 1;
        for(int j=low;j<high;j++){
            if(array[j] >= pivot){
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return (i + 1);

    }

    public static void quicksort(int[] array,int low,int high){
        
        if(low < high){
            
            int position = quick(array, low, high);
            for(int i=0;i<array.length;i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
            quicksort(array, low, position - 1);
            quicksort(array, position + 1, high);

        }
    }

    
    public static void main(String[] args) {
        int[] array = {6,7,4,5,2};
        
        quicksort(array, 0, array.length - 1);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        
    }
}


/*
 * https://www.geeksforgeeks.org/wrapper-classes-java/
 * 
 */
