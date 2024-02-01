public class Pattern3 {
    public static void main(String[] args) {
        // pattern 1 : 
        // int n = 4;
        // for(int i=1;i<=n;i++){
        //     for(int j=i;j<=n-1;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // pattern 2 : 
        // int n=3;
        
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print((char)(j+64) + " ");
            
        //     }
        //     System.out.println();
        // }

        // pattern 3 : 
        // int n=3;
        // char c='A';
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(c + " ");
        //         c++;
            
        //     }
        //     System.out.println();
        // }

        // pattern 4 : 

        // int n=3;
        // char c='A';
        // for(int i=1;i<=n;i++){
        //     for(int j=i;j<=n-1;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(c + " ");
        //         c++;
        //     }
        //     System.out.println();
        // }

        // pattern 5 :
        int n=5;
        for(int i=1;i<=n;i++){
            int sum = 0;
            for(int j=1;j<=i;j++){
                sum+=j;
                System.out.print(j+" ");
                if(j<i){
                    System.err.print(" + ");
                }
            }
            
            System.out.print(" = "+sum);
            System.out.println();
        }

        // pattern 6 : 

        // int n = 4;
        
        // for(int i=1;i<=n;i++){
        //     int index = 1;
        //     for(int j = n - i + 1; j >= 1; j--){
        //         System.out.print(index + " ");
        //         index+=2;
        //     }
        //     index = 1;
        //     for(int j = 1; j < i; j++){
        //         System.out.print(index + " ");
        //         index+=2;
        //     }
        //     System.out.println();
        // }

        // pattern 7 : 

        // int n = 4;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = n - i + 1; j >= 1; j--) {
        //         System.out.print(j + " ");
        //     }
        //     for (int j = 1; j < i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

    }
}
