import java.util.Scanner;

public class ThreeD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int[][][] three_d = new int[num][num][num];

        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                for(int k=0;k<num;k++){
                    three_d[i][j][k] = scanner.nextInt();
                }
            }
        }

        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                for(int k=0;k<num;k++){
                    System.out.print(three_d[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }


        scanner.close();
    
    }    
}
