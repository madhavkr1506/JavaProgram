public class Practice3 {
    public static boolean function1(int[] array){
        int n = array.length;
        int[] seq1 = {1,2,5,6};
        
        
        for(int i=0;i<seq1.length;i++){
            for(int j=0;j<n;j++){
                if(seq1[i] == array[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array1 = {11,1,2,13,14,5,6,7,8};
        System.out.println(function1(array1));

    }
}
