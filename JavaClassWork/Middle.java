public class Middle {
    public static int function1(int[] array,int num){
        int mid = (array[0] + array[num-1]) / 2;
        for(int i=0;i<num;i++){
            if(array[i] == mid){
                array[i] = (int)'M';
            }
        }
        return 0;
    }
    public static void printarray(int[] array,int num){
        for(int element : array){
            System.out.print(element+" ");
        }
    }
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};
        int num = array.length;
        // System.out.println(num);
        printarray(array, num);
        System.out.println();
        function1(array, num);
        printarray(array, num);

    }
}
