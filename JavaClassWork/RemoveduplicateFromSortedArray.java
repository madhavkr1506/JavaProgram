public class RemoveduplicateFromSortedArray {
    public static void removeDuplicates(int[] nums) {
        int n=nums.length;
        int index = 2;
        for(int i=2;i<n;i++){
            if(nums[i] != nums[index - 2]){
                nums[index++] = nums[i];
            }
        }
        for(int i=0;i<index;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] array = {1,1,1,2,2,3};
        removeDuplicates(array);
    }
}
