public class Array3 {
    public static void main(String[] args) {
        int[] array = {11,15,14,16,17,16,9,7,8};

        int n = array.length;

        // pattern 1 : 

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(array[j]+" ");
        //     }
        //     System.out.println();
        // }

        // print the sum of the first and last elements while iterating towards the middle : 

        try{
            for (int i = 0; i < n/2; i++) {
                System.out.print((array[i] + array[n-1-i]) + " ");
            }
            if(n % 2 != 0){
                System.out.print(array[n/2]+" ");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
