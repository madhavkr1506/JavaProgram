public class PalindromeString {
    public static boolean ispalindrome(String string){
        for(int i=0;i<string.length()/2;i++){
            if(string.charAt(i) != string.charAt(string.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String string = "racecara";
        System.out.println(ispalindrome(string));
    }
}
