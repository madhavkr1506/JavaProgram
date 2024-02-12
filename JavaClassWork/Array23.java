public class Array23 {
    // public static void merge(int[] array,int low,int mid,int high){
    //     int i=low;
    //     int j=mid + 1;
    //     int k=low;
    //     int[] temp = new int[100];
    //     while(i<=mid && j<=high){
    //         if(array[i] <= array[j]){
    //             temp[k] = array[i];
    //             k++;
    //             i++;
    //         }
    //         else{
    //             temp[k] = array[j];
    //             k++;
    //             j++;
    //         }
    //     }
    //     while(i<=mid){
    //         temp[k] = array[i]; 
    //         k++;
    //         i++;
    //     }
    //     while(j<=high){
    //         temp[k] = array[j];
    //         k++;
    //         j++;
    //     }

    //     for(int m=low;m<=high;m++){
    //         array[m] = temp[m];
    //     }
    // }
    // public static void mergesort(int[] array,int low,int high){
    //     if(low < high){
    //         int mid = (low + high) / 2;
    //         mergesort(array, low, mid);
    //         mergesort(array, mid+1, high);
    //         merge(array, low, mid, high);
    //     }
    // }


    public static int quick(int[] array,int low,int high){
        int pivot = array[low];
        int i = low+1;
        int j = high;
        int temp;
        do{
            while(array[i] <= pivot){
                i++;
            }
            while(array[j] > pivot){
                j--;
            }
            if(i < j){
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }while(i<j);
        temp = array[low];
        array[low] = array[j];
        array[j] = temp;
        return j;
    }

    public static void quicksort(int[] array,int low,int high){
        
        if(low < high){
            
            int position = quick(array, low, high);
            quicksort(array, low, position - 1);
            quicksort(array, position + 1, high);

        }
    }
    public static void main(String[] args) {
        int[] array = {5,4,3,6,7,8,9,2,1};
        // mergesort(array, 0, array.length-1);

        quicksort(array, 0, array.length-1);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}
