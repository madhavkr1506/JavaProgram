import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

class Frequency{
    public void function1(int array[]){
        HashMap<Integer,Integer> map1 = new HashMap<>();
        int n = array.length;
        for(int i=0;i<n;i++){
            if(map1.containsKey(array[i])){
                map1.put(array[i] , map1.get(array[i]) + 1);
            }
            else{
                map1.put(array[i],1);
            }
        }
        for(int ele : map1.keySet()){
            if(map1.get(ele) >= n/3){
                System.out.println(ele);
            }
        }
    }
}


public class PracticeHashing {
    public static void main(String[] args) {
        System.out.println("Hello");
//        Problem 1: Find elements in the array whose frequency is greater than n/3.

        int array[] = {1,2,3,4,5,6,1,1,1,2,3,4,5,6,1};
        Frequency obj1 = new Frequency();
//        obj1.function1(array);

//        This code will print all the elements along with its frequency.
        for(int i=0;i<array.length;i++){
            if(array[i] == -1){
                continue;
            }
            int count = 1;
            for(int j=i+1;j< array.length;j++){
                if(array[i] == array[j]){
                    count++;
                    array[j] = -1;
                }
            }
//            System.out.println(array[i] + " " + count);
        }

//        Problem 2: Union of two array.

        HashSet<Integer> set1 = new HashSet<>();

        int array1 [] = {1,2,3,4,5,6};
        int size1 = array1.length;
        int array2 [] = {5,6,1,7,8,9};
        int size2 = array2.length;
        for(int i=0;i<size1;i++){
            set1.add(array1[i]);
        }
        for(int i=0;i<size2;i++){
            set1.add(array2[i]);
        }
//        System.out.println(set1.size());

//        It will print all the elements of set1 :

        Iterator it = set1.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

//        Problem 3 :  Intersection of two arrays :

        HashSet<Integer> set2 = new HashSet<>();
        int count = 0;
        int array3[] = {1,2,3,4,5,6,7};
        int size3 = array3.length;
        int array4[] = {6,7,8,9};
        int size4 = array4.length;
        for(int i=0;i<size3;i++){
            set2.add(array3[i]);
        }
        for(int i=0;i<size4;i++){
            if(set2.contains(array4[i])){
                count++;
                set2.remove(array4[i]);
            }
        }
        System.out.println(count);

        Iterator it1 = set2.iterator();
        while(it1.hasNext()){
//            System.out.println(it.next());
        }


    }
}
