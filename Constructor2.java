public class Constructor2 {
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
        
// before extending parent1 class : 

        // parent1 obj1 = new parent1();
        // parent1 obj2 = new parent1(4);
        // parent1 obj3 = new parent1("Madhav",'M');

        // obj1.printparent();

        // children1 obj1 = new children1();
        // children1 obj2 = new children1('M');
        // children1 obj3 = new children1(3,4);
        // obj1.printchildren();


// after extending parent class : 

        // children1 obj1 = new children1();  // first it will print default constructor of parent1 class than it will print default constructor of children1 class. 
        // children1 obj2 = new children1('M');   // first it will print default constructor of parent1 class than it will print parameterized constructor of children1 class.
        // children1 obj3 = new children1(3,4);  // // first it will print default constructor of parent1 class than it will print parameterized constructor of children1 class.
        // obj1.printparent();  


        























    }
}
/*
 * https://www.geeksforgeeks.org/object-class-in-java/
 * https://www.geeksforgeeks.org/abstraction-in-java-2/
 * https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
 * 
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 * 
 * https://www.geeksforgeeks.org/boyer-moore-majority-voting-algorithm/
 * 
 * kadane algorithms
 * 
 */