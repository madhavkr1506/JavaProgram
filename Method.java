import java.util.Scanner;

public class Method {
    static int calculation(int x,int y,char ch){
        int res=0;
        if(ch == '*'){
            res =  x * y;
        }
        else if(ch == '/'){
            res = x / y;
        }
        else if(ch == '+'){
            res = x + y;
        }
        else if(ch == '-'){
            res = x - y;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch=scanner.next().charAt(0);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
//        int c=calculation(num1,num2,ch);

//        Object Creation
        Method object1 = new Method();
        int c=object1.calculation(num1,num2,ch);

        System.out.println(c);
    }
}
