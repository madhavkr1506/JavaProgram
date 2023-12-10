import java.util.Scanner;
class AddTwoNum {
    int num1, num2;
    char ch;
    int printDetails() {
        int res = num1 + num2;
//        System.out.println("The sum of "+num1+" "+ch+" "+num2+" is "+res);
        System.out.print("The sum of "+num1+" "+ch+" "+num2+" is ");
        return res;
    }
    String Name="Madhav";
    String name(){
        return Name;
    }
}
public class CreatingOwnClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is a custom class.");

        AddTwoNum object1 = new AddTwoNum();
        AddTwoNum object2 = new AddTwoNum();

//        Assigning attributes for the first object
        object1.num1=10;
        object1.num2=19;
        object1.ch='+';
        int c=object1.printDetails();
        System.out.println(c);

//        Assigning attributes for the second object
        object2.num1=20;
        object2.num2=19;
        object2.ch='+';
        int d=object2.printDetails();
        System.out.println(d);

//        Calling name method with the help of first object
//        object1.Name="Madhav";
        String Myname = object1.name();
        System.out.println(Myname);



    }
}
