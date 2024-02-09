// write a program to perform binary search in two dimensional array : 

public class Array14 {
    public static void printarray(int[][] array,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[] binarysearch(int[][] array,int n,int target){
        int row=array.length;
        int col=array[0].length;
        int left=0;
        int right=row * col - 1;
        while(left<=right){
            int mid = left + (right - left) / 2;
            int midelement = array[mid / col][mid % col];
            if(midelement == target){
                return new int[] {mid / col , mid % col};
            } 
            else if(midelement < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        return new int[] {-1,-1};
    }



    
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int n = array.length;

        printarray(array, n);

        int target = 9;

        int[] result = binarysearch(array, n, target);
        System.out.print(result[0]+" "+result[1]);
    }
}
