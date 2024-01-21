// write a program to get two sum which is equal to zero.
package ClassWork;
import java.util.*;

public class ClassWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
        Set<String> set1 = new HashSet<>();

        int num = scanner.nextInt();
        for(int i=0;i<num;i++){
            int value = scanner.nextInt();
            list1.add(value);
        }



//        for(int i=0;i<list1.size();i++){
//            for(int j=i+1;j<list1.size();j++){
//                if(list1.get(i) + list1.get(j) == 0){
//                    System.out.println(list1.get(i)+","+list1.get(j));
//                }
//            }
//        }

        for(int i=0;i<list1.size();i++) {
            for (int j = i + 1; j < list1.size(); j++) {
                if (list1.get(i) + list1.get(j) == 0) {
                    int[] array = {list1.get(i), list1.get(j)};
                    Arrays.sort(array);
                    String string = Arrays.toString(array);
                    if (!set1.contains(string)) {
                        System.out.println(string);
                        set1.add(string);
                    }
                }
            }
        }
    }
}
