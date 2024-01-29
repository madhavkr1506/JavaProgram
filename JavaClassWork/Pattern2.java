import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        // for(int i=1;i<=num;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=num;i++){
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=num;i++){
        //     for(int j=num-i+1;j>=1;j--){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=num;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=num;i++){
        //     for(int j=num-i;j>=1;j--){
        //         System.out.print("* ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=num;i++){
        //     for(int j=num-i;j>=1;j--){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=num;i++){
        //     for(int j=num-i;j>=1;j--){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        for(int i=1;i<=num;i++){
            for(int j=num-i+1;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=i-1;j>=1;j--){
                System.out.print("    ");
            }
            for(int j=num-i+1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }


        scanner.close();
    }
}
