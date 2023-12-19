
class GenericClass <A,B>{
    private A a1;
    private B b1;
    public GenericClass(A a1,B b1){
        this.a1 = a1;
        this.b1 = b1;
    }
    public A getA1(){
        return a1;
    }
    public void setA1(A a1){
        this.a1 = a1;
    }
    public B getB1(){
        return b1;
    }
    public void setB1(B b1){
        this.b1 = b1;
    }
}

public class Generic {
    public static void main(String[] args) {
        GenericClass g1 = new GenericClass<String,String>("Madhav","Kumar");
        System.out.println(g1.getA1());
        System.out.println(g1.getB1());

    }
}
