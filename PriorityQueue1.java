import java.util.Scanner;
import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue1 = new PriorityQueue<>();
        for(int i=0;i<5;i++){
            queue1.add(i);
        }
        while(!queue1.isEmpty()){
            System.out.println(queue1.poll());
        }
    }
}