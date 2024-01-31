public class Array2 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7};
        int[] array2 = {3,4,5,6,7,8,9};
        int[] array3 = {6,7,8,9,0,1,2};

        try{
            if(array1.length != array2.length){
                throw new IllegalArgumentException("Keep the array's length the same / सरणी की लंबाई समान रखें");
            }
            for(int i=0;i<array2.length;i++){
                System.out.print((array1[i] + array2[i] + array3[i])+" ");
            }
            System.out.println();
        }catch(IllegalArgumentException e){
            System.out.print(e.getMessage());
            // System.out.println(e.toString());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }
}
