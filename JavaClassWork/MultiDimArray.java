import java.util.Scanner;

public class MultiDimArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Multi-dimensional array");
        int num = scanner.nextInt();
        int[][] two_dim = new int[num][num];
        for(int i = 0;i < num;i++){
            for(int j = 0;j < num;j++){
                two_dim[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0;i < num;i++){
            for(int j = 0;j < num;j++){
                System.out.print(two_dim[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}