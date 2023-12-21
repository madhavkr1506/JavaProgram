import java.util.HashMap;
import java.util.Scanner;

public class SubArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10,2,-2,-20,10};
        int k=-10;
        int count=0;

//        for(int i=0;i< array.length;i++){
//            int sum=0;
//            for(int j=i;j< array.length;j++){
//                sum+=array[j];
//                if(sum == k){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);

//        2 : HashMap

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0;
        for(int i=0;i< array.length;i++){
            sum+=array[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            if (map.containsKey(sum)) {
                map.put(sum,map.get(sum) + 1);
            }
            else{
                map.put(sum,1);
            }
        }
        System.out.println(count);



    }
}
