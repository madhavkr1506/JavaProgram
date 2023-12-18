import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(6);
        set.add(5);
        set.add(8);
        set.add(6);
//        System.out.println(set);
//        if(set.contains(5)){
//            System.out.println("set contain 5");
//        }
//        if(!set.contains(15)){
//            System.out.println("does not contain 15");
//        }
//        set.remove(1);
//        if(!set.contains(1)){
//            System.out.println("set does not contain 1");
//        }

//        System.out.println("Size of set is " + set.size());

        Iterator it = set.iterator();
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.hasNext());

        while(it.hasNext()){
            System.out.println(it.next());
        }

//        Note : HashSet -- > It makes no guarantees as to the iteration order of the set.

    }
}
