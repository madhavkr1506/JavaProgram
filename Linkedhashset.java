import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Linkedhashset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Integer> linkedhashset1 = new LinkedHashSet<>();

        linkedhashset1.add(6);
        linkedhashset1.add(8);
        linkedhashset1.add(3);
        linkedhashset1.add(11);
        linkedhashset1.add(11);
        System.out.println(linkedhashset1);
    }
}
