public class PatternPractice1 {

    public static void main(String[] args) {
        int num = 5;
        // for(int i=0;i<num;i++){
        //     for(int j=0;j<num-i;j++){
        //         System.out.print((j+1)+" ");
        //     }
        //     for(int j=0;j<i;j++){
        //         System.out.print((j+1)+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=0;i<num;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print(i+1+" ");
        //     }
            
        //     System.out.println();
        // }

        for(int i=0;i<num;i++){
            for(int j=0;j<num-i-1;j++){
                System.out.print("  ");
            }
            for(int j=i;j<=i;j++){
                System.out.print((j+1)+" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<=i;j++){
                for(int k=j;k<=j;k++){
                    System.out.print(i+1+" ");
                }
            }
            System.out.println();
        }


    }
}