import java.util.*;
public class ArrayDeque2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> queue = new ArrayDeque<>();
        while(true){
            System.out.println("1.insert element");
            System.out.println("2.delete element");
            System.out.println("3.view element");
            System.out.println("4.exit");

            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter input : ");
                    int ele = sc.nextInt();
                    queue.add(ele);

                    break;
                
                case 2 : 
                    if(queue.isEmpty()){
                        System.out.println("Queue is empty");
                    }else{
                        System.out.println("Deleting element");
                        // queue.poll();
                        // queue.pop();
                        queue.removeLast();
                        System.out.println("Element deleted");
                    }
                    break;
                case 3 : 
                    if(queue.isEmpty()){
                        System.out.println("Queue is empty");
                    }else{
                        for(int i : queue){
                            System.out.print(i+" ");
                        }
                        System.out.println();
                    }
                    break;
                case 4 :

                    System.exit(0);
                    sc.close();
                
                    
                default:
                    System.out.println("Invalid Option");
                    break;
            }

        }
        
    }
}
