public class Longestcommonsubsequence {

    public static int commonsubsequence(String str1,String str2,int m,int n){
        if(m == 0 || n == 0){
            return 0;
        }
        if(str1.charAt(m - 1) == str2.charAt(n - 1)){
            return 1 + commonsubsequence(str1, str2, m - 1, n - 1);
        }
        else{
            return Math.max(commonsubsequence(str1, str2, m, n - 1) , commonsubsequence(str1, str2, m - 1, n));
        }
        
    }
    public static void main(String[] args) {
        String str1 = "madhav";
        String str2 = "adha";

        int m = str1.length();
        int n = str2.length();

        System.out.println(commonsubsequence(str1, str2, m, n));

        
    }
}
