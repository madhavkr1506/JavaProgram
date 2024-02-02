public class Array4 {
    public static void main(String[] args) {
        int num = 26;
        for(int i=1;i<=num;i++){
            for(int j=i;j <= 2 * i - 1;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=num-i;j++){
                System.out.print((char)(j + 64) + " ");
            }
            System.out.println();
        }
    }
}
