import java.util.PriorityQueue;

public class PrQueueBST {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(6);
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(2);
        priorityQueue.add(1);

        binaryTree(priorityQueue);

    }
    public static void binaryTree(PriorityQueue<Integer> priorityQueue){
        while (priorityQueue.size() > 1) {
            int left = priorityQueue.poll();
            int right = priorityQueue.poll();

            int root = left + right;

            System.out.println("Left node = "+ left +" , Right node = "+ right + " , Root node = " + root);

            priorityQueue.add(root);

        }
    }
}
