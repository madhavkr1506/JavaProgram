import java.util.Arrays;

public class String2 {
    public static void main(String[] args) {
        String string1 = "listen";
        String string2 = "Silent";
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        char[] array1 = string1.toCharArray();
        char[] array2 = string2.toCharArray();

        Arrays.sort(array1);
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
        }
        Arrays.sort(array2);
        System.out.println();
        for(int i=0;i<array2.length;i++){
            System.out.print(array2[i]+" ");
        }

        System.out.println();
        System.out.println(Arrays.equals(array1, array2));
        

    }
}
/*
 * https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/
 * 
 */