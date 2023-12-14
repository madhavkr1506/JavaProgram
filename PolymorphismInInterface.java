import java.util.Scanner;

interface addition{
    void add(int num1,int num2);
}
interface subtraction{
    void sub(int num1,int num2);
}
interface multiplication{
    void multiply(int num1,int num2);
}
interface division{
    void divide(float num1,float num2);
}
class Operation implements addition,subtraction,multiplication,division{
    public void add(int num1,int num2){
        System.out.println("The sum of "+num1+" + "+num2+" is " + (num1 + num2));
    }
    public void sub(int num1,int num2){
        System.out.println("The subtract of "+num1+" - "+num2+" is " + (num1 - num2));
    }
    public void multiply(int num1,int num2){
        System.out.println("The product of "+num1+" * "+num2+" is " + (num1 * num2));
    }
    public void divide(float num1,float num2){
        System.out.println("The division of "+num1+" / "+num2+" is " + (num1 / num2));
    }
}
public class PolymorphismInInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Operation obj1 = new Operation();
//        obj1.add(8,9);
//        obj1.sub(8,9);
//        obj1.multiply(8,9);
//        obj1.divide(8,9);

        addition obj2 = new Operation();
        obj2.add(8,9);
//        obj2.sub(8,9);  //  ---> It will throw an error.



    }
}
