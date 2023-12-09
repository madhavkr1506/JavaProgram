public class LargestSmallestElement {
    public static void main(String[] args) {
        int [] array1={1,2,3,4,5,-6,7,8,9,-10};
        int largest=array1[0];
        int smallest=array1[0];
        for(int i=0;i<array1.length;i++){

            if(array1[i] > largest){
                largest=array1[i];
            }
        }
        System.out.println(largest);
        for(int i=0;i<array1.length;i++){

            if(array1[i] < smallest){
                smallest=array1[i];
            }
        }
        System.out.println(smallest);
    }
}
