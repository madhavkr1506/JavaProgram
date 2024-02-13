public class Practice2 {
    public static void printarray(int[] array){
        int n = array.length;
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void function1(int[] array){
        int n = array.length;
        for(int i=1;i<n;i++){
            int temp = array[i];
            int j = i - 1;
            while(j>=0 && array[j] > temp){
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
            printarray(array);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] array = {4,5,3,2,6,7};
        printarray(array);
        System.out.println();
        System.out.println();
        function1(array);
        // printarray(array);
    }
}
