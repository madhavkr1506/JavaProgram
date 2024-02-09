// perform linear search on two dimensional array

public class Array13{
    public static int[] linearsearch(int[][] array,int n,int target){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(array[i][j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public static void printarray(int[][] array,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int n = array.length;
        printarray(array, n);


        int target = 2;
        int[] result = linearsearch(array, n, target);
        System.out.println(result[0]+" "+result[1]);
    }
}


/*
 * https://leetcode.com/problems/search-a-2d-matrix/description/
 * https://leetcode.com/problems/search-a-2d-matrix/description/
 * https://leetcode.com/problems/search-a-2d-matrix-ii/description/
 * https://leetcode.com/problems/search-a-2d-matrix-ii/description/
 * https://www.geeksforgeeks.org/move-zeroes-end-array/
 * https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1
 */