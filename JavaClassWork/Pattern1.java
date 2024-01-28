import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=1;i<=num;i++){
            for(int j = 1;j<=num - i;j++){
                System.out.print("  ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j = i-1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
    
}
