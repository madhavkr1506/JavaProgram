// write a program to print common element in between three sorted array.


import java.util.ArrayList;

public class Array22 {
    public static int[] commonelement(int[] arr1,int[] arr2,int[] arr3){
        ArrayList<Integer> list = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = arr3.length;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                for(int k=0;k<n3;k++){
                    if(arr1[i] == arr2[j] && arr2[j] == arr3[k]){
                        list.add(arr1[i]);
                        break;
                    }
                }
            }
        }
        int[] res = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 10, 20, 40, 80 };
        int[] arr2 = { 6, 7, 20, 80, 100 };
        int[] arr3 = { 3, 4, 15, 20, 30, 70, 80, 120 };
        

        int[] res = commonelement(arr1, arr2, arr3);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
 
    }
}
