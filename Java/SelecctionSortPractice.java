public class SelecctionSortPractice {
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
            int min = i;
            for(int j=i+1;j<n;j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
            printarray(array, n);
        }
        // printarray(array, n);
    }
}
