import java.util.Scanner;
import java.util.PriorityQueue;

public class PriorityQueue3 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue1 = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        for(int i=1;i<=5;i++){
            System.out.format("Enter input %d ",i);
            int element=scanner.nextInt();
            queue1.add(element);
        }
//        while(!queue1.isEmpty()){
//            System.out.print(queue1.poll() + " ");
//        }
        System.out.println();
        System.out.print("Enter position ");
        int position = scanner.nextInt();

        for(int i=1;i<position;i++){
            queue1.poll();

        }
        System.out.println(queue1.peek());
    }
}
