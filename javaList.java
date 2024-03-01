import java.util.ArrayList;
import java.util.List;

public class javaList {

    public static void main(String[] args) {
        // list in java provides the facility to maintain the ordered collection.
        // it contains the index based methods to insert, update, delete and search elements. it can have duplicate elements also.
        // we can also store null elements in the list.
        // the list interface found in java.util package and inherits the collection interface.
        // it is a factory of list iterator interface.
        // through the list iterator, we can iterate the list in forward and backward directions. the implementation classes of list interface are arraylist, linkedlist, stack and vector.

        List<String>list1 = new ArrayList<>();
        list1.add(0,"Madhav");
        list1.add(1,"Krishna");


        System.out.println(list1);


        List<Integer>list2 = new ArrayList<>();
        list2.add(0,1);
        list2.add(1,2);
        list2.add(2,3);
        list2.add(3,4);

        System.out.println(list2);

        // list1.addAll(1, list2); --> it will throw an error because : list1 is of type String and list2 is of type Integer.

        List<Integer>list3 = new ArrayList<>();
        list3.add(0,11);
        list3.add(1,21);
        list3.add(2,31);
        list3.add(3,41);

        System.out.println(list3);

        list2.addAll(1,list3);  // --> from index 1 of list2, list3 elements will be added up.

        System.out.println(list2);

        // remove() method is used to remove the element at particular index.

        list2.remove(0);

        System.out.println(list2);

        // get() method is used to print element at particular index.

        System.out.println(list2.get(2));

        // getFirst() to fetch first element of list2:

        System.out.println(list2.getFirst());

        // getLast() to fetch last element of list2:

        System.out.println(list2.getLast());

        // set() method will replace element at a index.
        list2.set(0,100);

        System.out.println(list2);



    }
}