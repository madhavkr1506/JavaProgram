public class Array32 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int n = array.length;

        for(int i=0;i<n;i++){
            System.out.println(array[i]+" "+(int)Math.pow(array[i],2));
            
        }
    }
}
