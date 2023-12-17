import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(5);  //  --> Initial capacity is set to 5.
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
//        list1.add(6);
//        list1.add(1,9); // --> (Index,Element);
//        list1.add(2,8);

        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        list2.add(6);

//        1 : Method one
        System.out.println("Elements in the list are : " + list1);
        System.out.println("Elements in the list are : " + list2);

//        2 : Method two
        for (int i=0;i<list1.size();i++){
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
        for (int i=0;i<list2.size();i++){
            System.out.print(list2.get(i) + " ");
        }

        System.out.println();

//        list1.addAll(list2);
//        System.out.println(list1);

        list1.addAll(0,list2);
        System.out.println(list1);

        System.out.println(list1.contains(10));
        System.out.println(list1.contains(11));
        System.out.println(list1.indexOf(4));
        System.out.println(list1.lastIndexOf(6));
        System.out.println(list1.indexOf(15)); // --> Return -1 : Element not present in the list.
        list1.set(1,100);
        System.out.println(list1);


    }
}
