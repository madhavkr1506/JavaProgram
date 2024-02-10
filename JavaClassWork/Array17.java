import java.util.Arrays;
import java.util.Scanner;

public class Array17 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] num3 = new int[len1 + len2];

        for (int i = 0; i < len1; i++) {
            num3[i] = nums1[i];
        }

        for (int i = 0; i < len2; i++) {
            num3[len1 + i] = nums2[i];
        }

        Arrays.sort(num3);
        int totallength = len1 + len2;
        if(totallength % 2 == 0){
            int midindex1 = totallength / 2 - 1;
            int midindex2 = totallength / 2;
            return (num3[midindex1] + num3[midindex2]) / 2.0;
        }
        else{
            int midindex = totallength / 2;
            return num3[midindex];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int num1[] = new int[n];

        for (int i = 0; i < n; i++) {
            num1[i] = scanner.nextInt();
        }


        int m = scanner.nextInt();

        int num2[] = new int[m];

        for (int i = 0; i < m; i++) {
            num2[i] = scanner.nextInt();
        }

        System.out.println(findMedianSortedArrays(num1, num2));

        scanner.close();
    }
}



