package practice;
public class Rectangle extends Shape{
    Rectangle(int dim1,int dim2){
        super(dim1,dim2);
    }
    public void area(){
        System.out.println("The area of a rectangle is " + (this.getdim1() * this.getdim2()));
    }
    public static void main(String[] args) {
        System.out.println("Hello Rectangle class.");
        Rectangle r2 = new Rectangle(5,6);
        // System.out.println(r2);
        r2.area();

    }
}





