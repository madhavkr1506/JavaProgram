package practice;
public class Square extends Shape{
    Square(int dim1,int dim2) {
        super(dim1,dim1);
    }
    public void area2(){
        System.out.println("The area of square is " + (this.getdim1() * this.getdim1()));
    }

    public static void main(String[] args) {
        System.out.println("Hello Square class.");
        Square sq = new Square(11, 11);
        sq.area2();
    }
    
}
