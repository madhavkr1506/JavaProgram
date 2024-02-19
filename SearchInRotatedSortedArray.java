public class SearchInRotatedSortedArray {
    public static boolean function1(int[] array,int target){
        int left = 0;
        int right = array.length - 1;
        while(left<=right){
            int mid = (left + right) / 2;
            if(array[mid] == target){
                return true;
            }
            if(array[left]<array[mid]){
                if(array[left]<=target && target<array[mid]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            else if(array[left] > array[mid]){
                if(array[mid]<target && target<=array[right]){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
            else{
                left++;
            }
        }

        
        return false;
    }
    public static void main(String[] args) {
        int[] array = {2,5,6,0,0,1,2};
        // int[] array = {1,2,3,4,5,6};
        System.out.println(function1(array, 6));
    }
}
