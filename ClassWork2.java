// write a program to get three sum which is equal to zero.

import java.util.*;

public class ClassWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int [] array = new int[num];
        for(int i=0;i<num;i++){
            array[i] = scanner.nextInt();
        }
        Set<String> set1 = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                for(int k=j+1;k<num;k++){
                    if((array[i] + array[j] + array[k]) == 0){
                        int storeResult[] = {array[i],array[j],array[k]};
                        Arrays.sort(storeResult);
                        String ArrayRes = Arrays.toString(storeResult);
                        if(!set1.contains(ArrayRes)){
                            result.add(Arrays.asList(storeResult[0],storeResult[1],storeResult[2]));
                            set1.add(ArrayRes);
                        }
                    }
                }
            }
        }
        System.out.println(result);


    }
}
