import java.util.Scanner;

class Hello extends Thread{
    public void run(){
        int i=1;
        while(i<=200) {
            System.out.println("This is Hello thread.");
            try{
                Thread.sleep(500);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            i++;
        }
    }
}
class Bye extends Thread{
    public void run(){
        int i=1;
        while(i<=200){
            System.out.println("Thread");
            i++;
        }
    }
}

public class ThreadMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hello h = new Hello();
        Bye b = new Bye();
        h.start();
//        try{
//            h.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }

//        try{
//            Thread.sleep(500);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        b.start();

    }
}
