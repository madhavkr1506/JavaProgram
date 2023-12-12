import java.util.Scanner;

class Rectangle{
    private int length;
    private int breadth;

    public int getLength(){
        return length;
    }

    public void setLength(int len){
        this.length=len;
    }

    public int getBreadth(){
        return breadth;
    }

    public void setBreadth(int bre){
        this.breadth=bre;
    }

    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
        int perimeter = 2 * (length + breadth);
        System.out.println("The perimeter of the rectangle whose length is "+length+"cm and breadth is "+breadth+"cm is "+perimeter);
    }

    public void Rectangle1(){
        int area = length * breadth;
        System.out.println("The area of the rectangle whose length is "+length+"cm and breadth is "+breadth+"cm is "+area);
    }

}

public class RectangleConstructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();
        Rectangle data1 = new Rectangle(length,breadth);
        data1.setLength(length);
        data1.setBreadth(breadth);
        data1.Rectangle1();

    }
}
