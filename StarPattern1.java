import java.util.Scanner;

public class StarPattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        for(int i=num;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }
        System.out.println();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
