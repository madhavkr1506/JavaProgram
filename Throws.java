import java.util.Scanner;

public class Throws {
    public static void function1(float[] array) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number = ");
        int num = scanner.nextInt();
        scanner.close();
        if(num == 0){
            throw new Exception("Num == 0");
        }
        for(int i=0;i<array.length;i++){
            array[i] = array[i]/num;
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
    public static void main(String[] args) {
        float[] array = {1,2,3,4,5,6,7,8,0};
        try{
            function1(array);
        }catch(Exception e){
            System.out.println("Exception thrown");
            System.out.println(e.getMessage());
        }
        

    }
}
