public class Practice13 {
    interface interface1{
        void function1();
    }
    static class parent implements interface1{
        public void function1(){
            System.out.println("Hello this is function1 of parent class");
        }
        parent(){
            System.out.println("Hello this is default constructor of parent class");
        }
        parent(int a , int b){
            System.out.println("Num1 + Num2 = "+(a+b));
        }
        protected String name;

        public void setName(String name){
            this.name = name;
        }

        public String getName(){
            return name;
        }

    }
    static class children extends parent{
        public void function1(){
            System.out.println("Hello this is function1 of children class");
        }
        public void function2(){
            System.out.println("Hello this is function2 of children class");
            System.out.println("name = " + super.name);

        }
        children(){
            System.out.println("This is default constructor of children class.");
        }
        children(int a,int b,int c){
            super(a, b);
            System.out.println("Num1 x Num2 x Num3 = " + (a*b*c));
        }
    }
    public static void main(String[] args) {
        // parent obj1 = new parent(1,2);
        // obj1.function1();
        // obj1.function2();  --> It is not correct way to access function2. It will throw an error.

        // children obj1 = new children();
        // obj1.function1();
        // obj1.function2();

        
        children obj1 = new children(11,11,11);
        obj1.setName("Madhav");
        obj1.function2();
        // obj1.function1();

    }
}
