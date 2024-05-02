import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
 
public class ArrayDeque1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Deque<Integer> deque = new ArrayDeque<>();
        String[] nums = sc.nextLine().split(" ");
        for(int i=0;i<nums.length;i++){
            deque.add(Integer.parseInt(nums[i]));
        }        

        while(true){
            System.out.println("1.add() queue");
            System.out.println("2.addAll() queue");
            System.out.println("3.addFirst() queue");
            System.out.println("4.addLast() queue");
            System.out.println("5.offer() queue");
            System.out.println("6.offerFirst() queue");
            System.out.println("7.offerLast() queue");
            System.out.println("8.contains() queue");
            System.out.println("9.peek() queue");
            System.out.println("10.poll() queue");
            System.out.println("11.pop() queue");
            System.out.println("12.push() queue");
            System.out.println("13.removeFirst() queue");
            System.out.println("14.removeLast() queue");
            System.out.println("15.getFirst() queue");
            System.out.println("16.getLast() queue");

            System.out.println("Enter choice : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    
                    int ele = sc.nextInt();
                    deque.add(ele);
                    break;
                case 2:
                    Deque<Integer> newDeque = new ArrayDeque<>();
                    int noOfele = sc.nextInt();
                    for(int i=0;i<noOfele;i++){
                        int item = sc.nextInt();
                        newDeque.add(item);
                    }
                    deque.addAll(newDeque);
                    break;
                case 3:
                    int addfirst = sc.nextInt();
                    deque.addFirst(addfirst);
                    break;
                case 4:
                    int addlast = sc.nextInt();
                    deque.addLast(addlast);
                    break;
                case 5:
                    int offer = sc.nextInt();
                    deque.offer(offer);
                    break;
                case 6:
                    int offerfirst = sc.nextInt();
                    deque.offerFirst(offerfirst);
                    break;
                case 7:
                    int offerlast = sc.nextInt();
                    deque.offerLast(offerlast);
                    break;
                case 8:
                    int contain = sc.nextInt();
                    boolean res = deque.contains(contain);
                    System.out.println(res);
                    break;
                case 9:
                    int peekele = deque.peek();
                    System.out.println(peekele);
                    break;
                
                case 10:
                    int pollele = deque.poll();
                    System.out.println(pollele);
                    break;
                case 11:
                    int popele = deque.pop();
                    System.out.println(popele);
                    break;
                case 12:
                    int pushele = sc.nextInt();
                    deque.push(pushele);
                    break;
                case 13:
                    int removefirst = deque.removeFirst();
                    System.out.println(removefirst);
                    break;
                case 14:
                    int removelast = deque.removeLast();
                    System.out.println(removelast);
                    break;
                case 15:
                    int getfirst = deque.getFirst();
                    System.out.println(getfirst);
                    break;
                case 16:
                    int getlast = deque.getLast();
                    System.out.println(getlast);
                    break;
                case 0:
                    System.exit(0);
                    sc.close();


            
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
            
        }
        
        


    }
}