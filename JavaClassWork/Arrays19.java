

public class Arrays19 {
    public static void sortarray(int[] array,int num){
        for(int i=0;i<num-1;i++){
            for(int j=0;j<num-i-1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }


    public static void printarray(int[] array,int num){
        for(int i=0;i<num;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static String printposition(int[] array,int num,int target){
        String position = "";
        for(int i=0;i<num;i++){
            if(array[i] == target){
                position+=Integer.toString(i)+" ";
            }
        }
        return position;
    }


    public static void main(String[] args) {
        int[] array = {1,3,4,6,8,6,3,2,7};
        int num = array.length;
        sortarray(array, num);
        printarray(array, num);
        System.out.println();
        System.out.println(printposition(array, num,6));
        // printarray(array, num);
    }
}
