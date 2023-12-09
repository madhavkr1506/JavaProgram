import java.util.Queue;
import java.util.Scanner;
import java.util.PriorityQueue;


public class PriorityQueue2 {
    public static void main(String[] args) {
        PriorityQueue<Integer>queue1=new PriorityQueue<>();
        Scanner scanner=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            int element = scanner.nextInt();
            queue1.add(element);
        }

        for(int element : queue1){
            System.out.println(element);
        }
//        System.out.println(queue1.peek());
//        while(!queue1.isEmpty()){
//            System.out.println(queue1.poll());
//        }
    }
}
