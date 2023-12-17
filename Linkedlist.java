import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        System.out.println(list2);
        list1.add(0,11);
        System.out.println(list1);
        list2.add(0,12);
        System.out.println(list2);
        System.out.println(list1.contains(11));
        System.out.println(list2.contains(12));
//        list2.addAll(list1);
//        System.out.println(list2);
//        list2.addAll(0,list1);
//        System.out.println(list2);
        list1.addFirst(100);
        list1.addLast(200);
        System.out.println(list1);
        System.out.println(list1.indexOf(1));
        System.out.println(list1.lastIndexOf(5));
//        list1.clear();
        System.out.println(list1);


    }
}
