public class Constructor {
    static class parent1{
        parent1(){
            System.out.println("I am parent class constructor");
        }
        public void printparent(){
            System.out.println("I am a parent");
        }
    }
    static class children1 extends parent1{
        children1(){
            System.out.println("I am children class constructor");
        }
        public void printchildren(){
            System.out.println("I am a children");
        }
    }

    public static void main(String[] args) {
        
        // parent1.printparent(); --> Even though the parent1 class is static, the method printparent() is not static, so it belongs to instances of the class.

        // parent1 obj1 = new parent1();
        // obj1.printparent();

        // obj1.printchildren(); --> It will through an error

        // children1 obj2 = new children1();
        // obj2.printchildren();
        // obj2.printparent();   --> class children1 extends class parent1 


        // parent1 obj1 = new parent1();

        // children1 obj2 = new children1(); --> First parent1 class constructor will be called than children1 class constructor will be called.

        

        

    }
}
