public class Loop {

    public static void main(String[] args) {

        // pattern 1 : 
        // for(int i=0;i<4;i++){
        //     for(int j = 0;j<4;j++){
        //         System.out.print((j + 1)+" ");
        //     }
        //     System.out.println();
        // }
        
        // pattern 2 :
        // for(int i=0;i<4;i++){
        //     for(int j = 0;j<4;j++){
        //         System.out.print((i + 1)+" ");
        //     }
        //     System.out.println();
        // }

        // pattern 3 : 
        // int i=1;
        // while(i<=4){
        //     int j = 1;
        //     while (j<=4) {
        //         System.out.print(i+" ");
        //         j++;
        //     }
        //     i++;
        //     System.out.println();
        // }

        // pattern 4 :
        // int i=1;
        // while(i<=4){
        //     int j = 1;
        //     while (j<=4) {
        //         System.out.print(j+" ");
        //         j++;
        //     }
        //     i++;
        //     System.out.println();
        // }

        // pattern 5 :
        // for(int i=1;i<=4;i++){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print((j)+" ");
        //     }

        //     System.out.println();
        // }

        // pattern 6 :
        // for(int i=1;i<=4;i++){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print((i)+" ");
        //     }

        //     System.out.println();
        // }

        // pattern 7 :
        int value = 1;
        for(int i=1;i<=4;i++){
            for(int j = 1;j<=i;j++){
                System.out.print((value++)+" ");
                
            }

            System.out.println();
        }






    }
}