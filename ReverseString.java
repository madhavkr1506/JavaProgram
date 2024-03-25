public class ReverseString {

    public static void reverse(String str){
        StringBuilder obj1 = new StringBuilder(str);
        String output = obj1.reverse().toString();
        System.out.println(output);
    }
    public static void main(String[] args) {
        String name = "Madhav";
        // reverse(name);

        String output = new StringBuilder(name).reverse().toString();
        System.out.println(output);
    }
}
