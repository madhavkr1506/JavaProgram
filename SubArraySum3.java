// it has time complexity of nlogn

public class SubArraySum3 {

    public static int subarray(int[] array, int left, int right){
        if(left == right){
            return array[left];
        }
        int mid = (left + right) / 2;

        int leftsum = subarray(array, left, mid);
        int rightsum = subarray(array, mid + 1, right);

        int crosssum = divideconqure(array,left,mid,right);

        return Math.max(crosssum,Math.max(leftsum,rightsum));
    }

    public static int divideconqure(int[] array, int left, int mid, int right){
        int sum = 0;
        int leftArray = Integer.MIN_VALUE;
        int rightArray = Integer.MIN_VALUE;

        for(int i=mid;i>=left;i--){
            sum += array[i];
            if(leftArray < sum){
                leftArray = sum;
            }
        }

        sum = 0;

        for(int i=mid + 1;i<=right;i++){
            sum += array[i];
            if(rightArray < sum){
                rightArray = sum;
            }
        }


        return leftArray + rightArray;
    }
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        int n = array.length;

        System.out.println(subarray(array, 0, n-1));
    }
}
