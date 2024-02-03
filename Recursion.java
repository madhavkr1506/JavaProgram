// write a program to sort an array using recursion : 

public class Recursion {

    public static void function1(int[] array,int num){
        if(num == 0){
            return;
        }
        else{
            int maxindex = 0;
            for(int i=0;i<num;i++){
                if(array[i] > array[maxindex]){
                    maxindex = i;
                }
            }
            int temp = array[maxindex];
            array[maxindex] = array[num - 1];
            array[num - 1] = temp;

            function1(array, num-1);

        }

    }
    public static void main(String[] args) {
        int[] array = {11,15,14,16,18,17,19,13};
        int num = array.length;
        function1(array, num);
        for (int i = 0; i < num; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
