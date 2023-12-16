package practice;
public class Circle extends Shape {
    Circle(int dim1,int dim2){
        super(dim1,-1);
    }
    public void area3(){
        System.out.println("The area of circle is " + Math.PI * (this.getdim1() * this.getdim1()));
    }
    public static void main(String[] args) {
        System.out.println("Hello circle class.");
        Circle ci = new Circle(11, -1);
        ci.area3();
    }
}
