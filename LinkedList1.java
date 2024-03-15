import java.util.LinkedList;

// import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
        /*
         * java linkedlist class can contain duplicate elements.
         * java linkedlist class maintain insertion order. 
         * java linkedlist class is non synchronized.
         * in java linkedlist class, manipulation is fast because no shifting needs to occur.
         * java linkedlist class can be used as a list, stack or queue.
         * 
         */

         LinkedList<String> list1 = new LinkedList<>();

         list1.add("Madhav");
         list1.add("Krishna");
         list1.add("Rahul");
         list1.add("Rohan");
         list1.add("Ravi");
         list1.add("Ravi");

        //  System.out.println(list1);

        // Iterator<String> it1 = list1.iterator();
        // while(it1.hasNext()){
        //     System.out.println(it1.next());
        // }

        list1.add(1,"Shreya"); // add element at specific index
        System.out.println(list1);


        list1.addFirst("A"); // add at 0 index
        list1.addLast("Z");  // add at last index

        System.out.println(list1);

        list1.remove("Madhav");  // remove value
        list1.remove(3);  // remove at specific index

        list1.removeFirst();  // remove first element
        list1.removeLast();  // remove last element

        list1.removeFirstOccurrence("Ravi"); // remove first occurence
        list1.removeLastOccurrence("Ravi"); // remove last occurence

        // list1.removeAll(list1);  // remove all element 

        // list1.clear();  // remove all element available in the list1

        System.out.println(list1);

        // reverse list : 

        // Iterator it2 = list1.descendingIterator();
        // while (it2.hasNext()) {
        //     System.out.println(it2.next());
            
        // }


    }
}
