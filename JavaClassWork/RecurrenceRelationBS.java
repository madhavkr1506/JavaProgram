public class RecurrenceRelationBS {

    public static int function1(int[] array,int num,int low,int high,int found){
        int mid = (low + high) / 2;
        if(array[mid] == found){
            return array[mid];
        }
        else{
            if(low > high){
                return -1;
            }
            if(array[mid] > found){
                return function1(array, num, low, mid - 1, found);
            }
            else{
                return function1(array, num, mid + 1, high, found);
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int num = array.length;
        System.out.println(function1(array, num, 0, num - 1, 81));
    }
}