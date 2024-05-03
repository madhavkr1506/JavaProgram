public class InsertionSortPractice {
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
        for(int i = 1;i < n; i++){
            int key = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > key){
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
            printarray(array, n);
        }

        // System.out.println("array after sorting");
        // printarray(array, n);
    }

}
