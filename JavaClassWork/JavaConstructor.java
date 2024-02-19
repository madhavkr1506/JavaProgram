public class JavaConstructor {

    JavaConstructor(){
        System.out.println("Default constructor");
    }
    JavaConstructor(String name){
        System.out.println("My name is " + name);
    }

    int age;
    int mobile;
    JavaConstructor(int age,int mobile){
        this.age = age;
        this.mobile = mobile;
    }
    JavaConstructor(JavaConstructor obj2){
        this.age = obj2.age;
        this.mobile = obj2.mobile;
    }
    public static void main(String[] args) {
        /*
         * in java, a constructor is block of codes similar to the method. it is called when instance of the class is created.
         * every time an object is created using the new() keyword, at least one constructor is called.
         * constructors must have the same name as the class within which it is defined.
         * constructors do not return any type.
         * contructors are called only once at the time of object creation.
         * 
         * a constructors in java cannot be abstract, final, static or synchronized.
         * 
         * access modifiers can be used in constructors declaration to control its access i.e, which other class can call the constructor.
         * 
         * types of constructors : 
         * a. default constructor
         * b. parameterized constructor
         * c. copy constructor
         */


        //  default constructor : 

        //  JavaConstructor obj1 = new JavaConstructor();

        // parameterized constructors : 

        // JavaConstructor obj2 = new JavaConstructor("Madhav");
        
        // copy constructor : 
        
        JavaConstructor obj3 = new JavaConstructor(20,969374495);
        System.out.println(obj3.age+" "+obj3.mobile);

        JavaConstructor obj4 = new JavaConstructor(obj3);
        System.out.println(obj4.age+" "+obj4.mobile);
         
         
    }
}