import java.util.HashSet;
import java.util.Iterator;

public class Project4 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        int[] array1 = {1,2,3,4,5,6,7,8,9};
        int[] array2 = {1,2,3,4,5,11,12,13,14};
//        for(int i=0;i< array1.length;i++){
//            set1.add(array1[i]);
//        }
//        for(int i=0;i< array2.length;i++){
//            set1.add(array2[i]);
//        }
//        System.out.println(set1.size());
//        Iterator it1 = set1.iterator();
//        while (it1.hasNext()){
//            System.out.print(it1.next() + " ");
//        }
//        System.out.println();
        for(int i=0;i<array1.length;i++){
            set1.add(array1[i]);
        }
        int count = 0;
        for(int i=0;i<array2.length;i++){
            if(set1.contains(array2[i])){
                count++;
                set1.remove(array2[i]);
            }
        }
        System.out.println(count);
    }
}
