import java.util.Arrays;

public class BinaryTree {
    public static void main(String[] args) {
        int[] array = {6,4,5,3,1,2};
        Arrays.sort(array);

        binaryTree(array);


    }

    public static void binaryTree(int[] array){
        while(array.length > 1){
            Arrays.sort(array);
            int left = array[0];
            int right = array[1];

            int root = left + right;

            System.out.println("Left node = "+ left +" , Right node = "+ right + " , Root node = " + root);
            array = Arrays.copyOfRange(array, 2, array.length + 1);

            array[array.length - 1] = root;



        }
    }
}
