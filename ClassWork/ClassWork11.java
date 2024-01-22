package ClassWork;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class ClassWork11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String,Integer> hashMap = new HashMap<>();
        for(int i=0;i<2;i++){
            String name = scanner.next();
            int age = scanner.nextInt();
            hashMap.put(name,age);
        }
        Set<String> keys = hashMap.keySet();
        for(String key : keys){
            System.out.println(key + " " + hashMap.get(key));
            if(hashMap.get(key) > 18){
                System.out.println("Eligible to vote");
            }
            else{
                System.out.println("not eligible to vote");
            }
        }

    }
}
