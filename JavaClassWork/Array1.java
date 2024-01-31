// write a program to print common elements in between three array : 

public class Array1 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7};
        int[] array2 = {3,4,5,6,7,8,9,0};
        int[] array3 = {6,7,8,9};

        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                for(int k=0;k<array3.length;k++){
                    if(array1[i] == array2[j] && array2[j] == array3[k]){
                        System.out.print(array2[j]+" ");
                    }
                }
            }
        }
    }
}
