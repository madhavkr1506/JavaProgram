import java.util.Scanner;

class Priority1 extends Thread{
    Priority1(String name){
        super(name);
    }
    public void run(){
        int i = 1;
        while(i<=20) {
            System.out.println("Thread name is " + this.getName());
            i++;
        }
    }
}

public class ThreadPriorities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Priority1 p1 = new Priority1("Madhav");
        Priority1 p2 = new Priority1("Krishna");
        Priority1 p3 = new Priority1("Mahadev");
        Priority1 p4 = new Priority1("Ganesh ji");
        Priority1 p5 = new Priority1("Narayan");
        Priority1 p6 = new Priority1("Ram");
        p1.setPriority(Thread.MAX_PRIORITY);
        p2.setPriority(Thread.MIN_PRIORITY);
        p3.setPriority(Thread.MIN_PRIORITY);
        p4.setPriority(Thread.MIN_PRIORITY);
        p5.setPriority(Thread.MIN_PRIORITY);
        p6.setPriority(Thread.NORM_PRIORITY);
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
    }
}
