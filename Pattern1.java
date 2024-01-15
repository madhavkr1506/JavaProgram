import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        int num = 5;
//        for(int i=1;i<=num;i++){
//            for(int j=1;j<=num-i;j++){
//                System.out.print("  ");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print(k+" ");
//            }
//            System.out.println();
//        }

        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            for(int l=i;l>0;l--){
                System.out.print(l+" ");
            }
            System.out.println();
        }

    }
}
