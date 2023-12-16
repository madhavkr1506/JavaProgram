package practice;

public class Cylinder extends Shape{
    Cylinder(int dim1,int dim2){
        super(dim1,dim2);
    }
    public void area4(){
        System.out.println("The area of Cylinder is " + 2 * Math.PI * this.getdim1()  * (this.getdim1() + this.getdim2()));
    }
    public static void main(String[] args) {
        System.out.println("Hello Cylinder class");
        Cylinder c1 = new Cylinder(11, 11);
        c1.area4();
    }
}
