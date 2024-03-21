class outer{

    private int a;
    private int b;
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public void outerfunction1(){
        inner obj1 = new inner();
        obj1.function2(a,b);
    }

    class inner{
        public void function1(){
            System.out.println("This is function 1");
        }

        public void function2(int x,int y){
            System.out.println("The sum of two number is : " + (x + y));
        }
    }
}


public class Innerclass {
    

    public static void main(String[] args) {
        /*
         * there are certain advantages associated with inner classes are as follow:
         * 1. making code clean and readable
         * 2. private method of outer class can be accessed, so bringing a new dimension and making it closer to the real world.
         * 3. optimizing the code module.
         * 
         * 
         * There are four types of inner classes in java
         * 1. nested inner class
         * 2. method local inner class
         * 3. static nested class
         * 4. anonymous inner class
         * 
         * 
         * 
         */
        
        outer.inner inobj1 = new outer().new inner();
        inobj1.function1(); 

        outer ouobj1 = new outer();
        ouobj1.setA(10);
        ouobj1.setB(11);

        ouobj1.outerfunction1();


        



    }
}