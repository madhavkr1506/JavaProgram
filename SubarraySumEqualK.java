public class SubarraySumEqualK {

    public static int function1(int[] array,int target){
        int count = 0;
        int n = array.length;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum+=array[j];
                if(sum == target){
                    count++;
                }
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3};
        // int n = array.length;
        System.out.println(function1(array, 3));
        
    }
}