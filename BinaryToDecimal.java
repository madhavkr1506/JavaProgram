public class BinaryToDecimal {
    public static int binarytodecimalConverter(long num){
        int result = 0;
        int i = 0;
        while(num != 0){
            int rem = (int) (num % 10);
            result += rem * Math.pow(2, i);
            num /= 10;
            ++i;
        }
        return result;
    }
    public static void main(String[] args) {
        long num = 110110111;
        System.out.println(binarytodecimalConverter(num));


    }
}
