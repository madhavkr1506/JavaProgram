import java.util.Scanner;

class HelloEmployee{
    private int id;
    private int salary;
    private String name;

    int getId(){
        return id;
    }
    void setId(int Id){
        id = Id;
    }
    void setName(String myName){
        name = myName;
    }
    String getName(){
        return name;
    }

    int getSalary(){
        return salary;
    }

    void setSalary(int Salary){
        salary=Salary;
    }

}

public class AccessModifiers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HelloEmployee object1 = new HelloEmployee();
        object1.setId(12213356);
        object1.setName("Madhav kumar");
        object1.setSalary(56100);
        System.out.println(object1.getName());
        System.out.println(object1.getId());
        System.out.println(object1.getSalary());


    }
}
