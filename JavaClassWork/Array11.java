import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int[] array = {1,2,3,4,5,6,7,8,9,10};

        // System.out.println(array[0]); // It will print 0;
        // System.out.println(array[4]); // It will print 0;

        // for(int i=0;i<array.length;i++){
        //     array[i]=scanner.nextInt();
        // }

        // int sum = 0;

        // boolean value = true;
        // for(int i=0;i<array.length;i++){
        //     if(value){
        //         sum+=array[i];
        //     }
        //     value = !value;
            
        // }
        // System.out.println(sum);


        // for(int i=0;i<array.length;i++){
        //     for(int j=i;j<array.length;j++){
        //         System.out.println(array[i]+" "+ array[j]);
        //     }
        //     System.out.println();
        // }

        // System.out.println();
        // System.out.println();


        // for(int i=0;i<array.length;i++){
        //     for(int j=i;j<array.length;j++){
        //         if(array[i] > array[j] && i != j){
        //             System.out.print(array[i]);
        //         }
        //         else{
        //             System.out.print(array[j]);
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }



        int mixedarray[][] = {{1,2},{3,4}};
        // int length = mixedarray.length;
        // System.out.println(length);

        // System.out.println(mixedarray[1][0]);

        // for(int i=0;i<mixedarray[0].length;i++){
        //     System.out.print(mixedarray[0][i]+" ");
        // }


        // for(int i=0;i<mixedarray.length;i++){
        //     for(int j=0;j<mixedarray[i].length;j++){
        //         System.out.print(mixedarray[i][j]+" ");
        //     }
        //     System.out.println();
        // }


        
        int val[] = new int[mixedarray.length];
        int index = 0;
        for(int i=0;i<mixedarray.length;i++){
            int sum = 0;
            for(int j=0;j<mixedarray[i].length;j++){
                sum+=mixedarray[i][j];
            }
            val[index++]=sum;
        }

        int maxsum=0;
        for(int i=0;i<val.length;i++){
            if(val[maxsum] < val[i]){
                maxsum = i;
            }
        }

        for(int i=0;i<mixedarray[maxsum].length;i++){
            System.out.print(mixedarray[maxsum][i]+" ");
        }
        
        



        scanner.close();
    }



}

/*
 * 
 * for(int i=0;i<n;i++){
int j;
for(j=0;j<n;j++){
if(arr[i]==arr[j] && i!=j){
break;
}
}
if(j==n) return arr[i];
}
 * 
 */
