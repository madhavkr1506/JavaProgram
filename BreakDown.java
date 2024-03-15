public class BreakDown {

	public static int subarraysum(int[] array, int left, int right){
		if(left == right){
			return array[left];
		}
		int mid = (left + right) / 2;
		int leftsum = subarraysum(array, left, mid);
		int rightsum = subarraysum(array, mid + 1, right);
		int crosssum = divideandconquer(array, left, mid, right);
		return Math.max(crosssum, Math.max(leftsum,rightsum));
	}
	public static int divideandconquer(int[] array,int left, int mid, int right){
		int sum = 0;
		int leftarraysum = Integer.MIN_VALUE;

		for(int i = mid; i >= left; i--){
			sum = sum + array[i];
			if(sum > leftarraysum){
				leftarraysum = sum;
			}
		}

		sum = 0;

		int rightarraysum = Integer.MIN_VALUE;

		for(int i = mid + 1;i <= right; i++){
			sum = sum + array[i];
			if(sum > rightarraysum){
				rightarraysum = sum;
			}
		}

		return leftarraysum+rightarraysum;

	}

	public static void main(String[] args) {
		int[] array = {-2,1,-3,4,-1,2,1,-5,4};
		int n = array.length;

		System.out.println(subarraysum(array, 0, n-1));

	}
}