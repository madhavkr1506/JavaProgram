public class DivideAndConqure {

    public static int divideandconqure(int[] array, int n){
        int first = 0;
        int last = n - 1;
        return divideandconqureutil(array,first,last);
    }
    public static int divideandconqureutil(int[] array, int first, int last){
        if(first == last){
            return array[first];
        }
        int mid = (first + last) / 2;
        int leftsum = divideandconqureutil(array, first, mid);
        int rightsum = divideandconqureutil(array, mid+1, last);

        int crosssum = crosssumway(array,first,mid,last);

        return Math.max(crosssum,Math.max(leftsum,rightsum));

    }

    public static int crosssumway(int[] array, int first, int mid, int last){
        int leftarraysum = Integer.MIN_VALUE;
        int rightarraysum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=mid;i>=first;i--){
            sum+=array[i];
            if(leftarraysum < sum){
                leftarraysum = sum;
            }
        }
        sum = 0;
        for(int i=mid+1;i<=last;i++){
            sum+=array[i];
            if(rightarraysum < sum){
                rightarraysum = sum;
            }
        }

        int crosssum = leftarraysum + rightarraysum;
        return crosssum;
    }
    public static void main(String[] args) {
        int[] array = {2,-5,8,-3,1,-7};
        int n = array.length;

        System.out.println(divideandconqure(array, n));
    }
}
