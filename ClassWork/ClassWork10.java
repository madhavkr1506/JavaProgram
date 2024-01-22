package ClassWork;

public class ClassWork10 {
    static class MyException extends Exception{
        public String toString(){
            return "num2 is divided by 0";
        }
        public String getMessage(){
            return "num2 = 0";
        }
    }
    public static void Division(int num1,int num2) throws Exception{

        if (num2 == 0){
            throw new MyException();
        }
        System.out.println("num1 / num2 = " + num1 / num2);
    }
    public static void main(String[] args) {
        try{
            Division(10,0);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}
