public class Array21 {
    // public static int countpair(int[] array,int k){
    //     int count=0;
    //     for(int i=0;i<array.length;i++){
    //         for(int j=i+1;j<array.length;j++){
    //             if((array[i] + array[j]) == k){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }

    public static void displaypair(int[] array,int k){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if((array[i] + array[j]) == k){
                    System.out.println(array[i] + " " + array[j] + " = " + k);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, -1, 5 };
        int K = 6;

        // System.out.println(countpair(arr, K));
        displaypair(arr, K);

    }
}
