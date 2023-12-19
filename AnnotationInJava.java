
class Morning{
    @Deprecated
    public void java(){
        System.out.println("Hello java");
    }
    public void Hello(){
        System.out.println("Hello");
    }
}
class Evening extends  Morning{

    @Override
    public void Hello(){
        System.out.println("Hello Madhav");
    }
}
@FunctionalInterface
interface Afternoon{
    void win();
//    void won();
}



public class AnnotationInJava {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

//        Annotation :  Annotations are used to provide supplemental information about a program.
//        1 --> @override
//        This annotation assures that the subclass method is overriding the parent class method.
//        If it is not so, compile time error occurs.
//        2 --> @SuppressWarnings
//        This annotation: is used to suppress warnings issued by the compiler.
//        3 --> @Deprecated
//        This annoation marks that this method is deprecated so compiler prints warning.
//        It informs user that it may be removed in the future versions.
//        So, it is better not to use such methods.
//        4 --> @FunctionalInterface
//        A functional interface is an interface that contains only one abstract method.

        Morning m1 = new Morning();

        m1.Hello();

        m1.java();


    }
}
