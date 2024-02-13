public class Practice1 {
    public static void printarray(int[] array){
        int n = array.length;
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void function1(int[] array){
        int n = array.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
            printarray(array);
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        int[] array = {4,5,3,2,6,7};
        printarray(array);
        System.out.println();
        System.out.println();
        System.out.println();
        function1(array);
        // printarray(array);
    }
}