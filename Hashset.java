import java.util.HashSet;
import java.util.Scanner;

public class Hashset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> hashset1 = new HashSet<>(6,0.5f);
//        It has default initial capacity of (16) and load factor of (0.75).

        hashset1.add(6);
        hashset1.add(8);
        hashset1.add(3);
        hashset1.add(11);
        hashset1.add(11);
        System.out.println(hashset1);
    }
}
