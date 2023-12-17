import java.util.Scanner;

class Approach extends Exception{
    public String toString(){
        return "Num2 is Zero.";
    }
    public String getMessage(){
        return "Num2 == 0";
    }
}

class Approach2{
    public void function1(float num1,float num2) throws ArithmeticException{
        if(num2 == 0){
            throw new ArithmeticException();
        }
        float res = num1/num2;
        System.out.println("The result is " + res);
    }
}

class Approach3{
    public void function2(float num1,float num2) throws Approach{
        if(num2 == 0){
            throw new Approach();
        }
        float res = num1/num2;
        System.out.println("The result is " + res);
    }
}


public class PracticeTryCatchThrowThrows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();

//        1 : first approach

//        float res = num1/num2;
//        System.out.println("The result is " + res);
//        if(num2 == 0){
//            try{
//                throw new ArithmeticException();
//            }
//            catch(Exception e){
//                System.out.println("You are dividing num1 by 0.");
//                System.out.println(e);
//            }
//        }
//        else{
//            float res = num1/num2;
//            System.out.println("The result is " + res);
//        }


//        2 : second approach

//        try{
//            if(num2 == 0){
//                throw new ArithmeticException();
////                throw new Exception();
//            }
//
////            float res = num1/num2;
////            System.out.println("The result is " + res);
//
//        }
//        catch(Exception e){
//            System.out.println("This is level 1");
//            System.out.println(e);
//        }

//        3 : third approach

//        if(num2 == 0){
//            try{
//                throw new Approach();
//            }
//            catch (Approach a){
//                System.out.println(a.getMessage());
//            }
//        }
//        else{
//            float res = num1/num2;
//            System.out.println("The result is " + res);
//        }


//        4: fourth approach :

//        if(num2 == 0){
//            try{
//                throw new Approach();
//            }
//            catch (Exception a){
//                System.out.println(a.getMessage());
//                System.out.println(a.toString());
//                System.out.println(a);
//                a.printStackTrace();
//            }
//        }
//        else{
//            float res = num1/num2;
//            System.out.println("The result is " + res);
//        }

//        5 : fifth approach

//        Approach2 a2 = new Approach2();
//        try{
//            a2.function1(num1,num2);
//        }
//        catch (Exception e){
//            System.out.println("This is an exception.");
//            System.out.println(e);
//        }

//        6 : sixth approach

        Approach3 a3 = new Approach3();
        try{
            a3.function2(num1,num2);
        }
        catch (Exception e){
            System.out.println("This is an exception.");
            System.out.println(e);
            System.out.println(e.getMessage());
        }


    }
}
