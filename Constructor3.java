public class Constructor3 {
    static class parent1{
        parent1(){
            System.out.println("I am parent class class constructor");
        }
        parent1(int num){
            System.out.println("num = "+num);
        }
        parent1(String name, char gender){
            System.out.println("name = "+name+" | gender = "+gender);
        }
        void printparent(){
            System.out.println("I am parent class method");
        }
    }

    static class children1 extends parent1{
        children1(){
            System.out.println("I am children class constructor");
        }
        children1(char c){
            super(c);
            /*
             * Java implicitly converts the char parameter c to an int to match the closest available constructor in the parent class. Since there is a constructor in the parent class that takes an int parameter (parent1(int num)), Java uses that constructor and converts the char value to an int.
             * 
             */


            System.out.println("char = " + c);
        }
        children1(int num1,int num2){
            System.out.println("num1 = "+num1+" | num2 = "+num2);
        }
        void printchildren(){
            System.out.println("I am children class method");
        }
    }
    public static void main(String[] args) {
        // children1 obj1 = new children1();  
        // children1 obj2 = new children1('M'); // The character 'M' is converted to its ASCII value and printed as if it were an integer.
        // children1 obj3 = new children1(3,4);
        // obj1.printparent();  


        




    }
}
