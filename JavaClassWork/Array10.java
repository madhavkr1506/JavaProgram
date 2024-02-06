public class Array10 {
    public static int function1(int[] array,int num,int start,int last){
        int sum = 0;
        boolean notSum = false;
        for(int i=0;i<num;i++){
            if(array[i] == start || array[i] == last){
                notSum = !notSum; // Toggle ignoring flag
                continue;
            }
            if(!notSum){
                sum+=array[i];
            }
            
        }
        return sum;
    }

    public static int function2(int[] array,int num,int start,int last){
        int sum = 0;
        boolean found = false;
        for(int i=0;i<num;i++){
            if(array[i] == start || array[i] == last){
                if(found){
                    found = false;
                    continue;
                }
                else{
                    found = true;
                    continue;
                }
            }
            if(found){
                continue;
            }
            sum+=array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int num = array.length;
        // System.out.println(function1(array,num,3,6));
        System.out.println(function2(array, num, 3, 6));
        
    }
}
