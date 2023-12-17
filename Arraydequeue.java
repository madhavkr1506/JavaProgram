import java.util.ArrayDeque;
import java.util.Scanner;

public class Arraydequeue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(1);
        ad1.add(2);
        ad1.add(3);
        ad1.add(4);
        ad1.addFirst(11);
        ad1.addLast(12);
        System.out.println(ad1);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        ad1.offer(15);
        System.out.println(ad1);
        ad1.poll();
        System.out.println(ad1);
        ad1.offerFirst(11);
        System.out.println(ad1);

//        Note : Similar to ArrayList and LinkedList


    }
}
