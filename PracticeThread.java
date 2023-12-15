import java.util.Scanner;

class Jupiter extends Thread {
    public void run() {
        int i = 1;
        while (i <= 100) {
            System.out.println("I protect Earth.");
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            i++;
        }
    }
}


class Saturn extends Thread{
    public void run(){
        int i=1;
        while(i<=100){
            System.out.println("I shape solar system");
            try{
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            i++;
        }

    }
}


public class PracticeThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World");

        Jupiter j = new Jupiter();
        Saturn s = new Saturn();
        j.setPriority(9);
        s.setPriority(3);
        System.out.println(j.getPriority());
        System.out.println(s.getPriority());
        System.out.println(j.getState());
        System.out.println(Thread.currentThread().getState());

        j.start();
        System.out.println(j.getState());
        System.out.println(Thread.currentThread().getState());
        s.start();



    }
}
