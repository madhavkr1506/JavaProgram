import java.util.Scanner;

class thread1 extends Thread{
    public thread1(String name){
        super(name);
    }
    public void run(){
        System.out.println("I am thread.");
//        int i=0;
//        while(i<1){
//            System.out.println("I am a thread");
//            i++;
//        }
    }
}

class thread2 implements Runnable{

    public void run(){
        for(int i=0;i<1;i++){
            System.out.println("I am thread.");
        }
    }
}


public class ThreadConstructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        thread1 object1 = new thread1("Madhav");
        object1.start();
        System.out.println("Thread id is " + object1.threadId());
        System.out.println("Thread name is " + object1.getName());

        thread1 object2 = new thread1("Raj");
        object2.start();
        System.out.println("Thread id is " + object2.threadId());
        System.out.println("Thread name is " + object2.getName());

        thread2 object3 = new thread2();
        Thread th1 = new Thread(object3,"Krishna");
        th1.start();
        System.out.println("Thread id " + th1.threadId());
        System.out.println("Thread Name is " + th1.getName());

        thread2 object4 = new thread2();
        Thread th2 = new Thread(object3);
        th2.start();
        System.out.println("Thread id " + th2.threadId());
        System.out.println("Thread Name is " + th2.getName());   //---> Java run time system will generate default thread name.

    }
}
