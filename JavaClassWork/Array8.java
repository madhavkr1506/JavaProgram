// write a program to print all subarray whose sum is 0 :

import java.util.ArrayList;

class pair{
    int first;int second;
    pair(int a,int b){
        this.first = a;
        this.second = b;
    }
}
public class Array8 {
    public static ArrayList<pair> function1(int[] array,int n){
        ArrayList<pair> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            int prefix = 0;
            for(int j=i;j<n;j++){
                prefix+=array[j];
                if(prefix == 0){
                    result.add(new pair(i, j));
                }
            }
        }
        return result;
    }
    public static void print(ArrayList<pair> result){
        for(int i=0;i<result.size();i++){
            pair outpPair = result.get(i);
            System.out.println("Subarray found from "+outpPair.first+" to "+outpPair.second);
        }
    }
    public static void main(String[] args) {
        int[] array = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        int n = array.length;

        ArrayList<pair> output = function1(array, n);
        print(output);
    }
}
