// kmp search algorithm : 

public class Array34 {

    public static void patternmatching(String string,String pattern){
        int n = string.length();
        int m = pattern.length();

        int lps[] = new int[m];
        longestprefixsuffix(pattern, lps, m);
        int i = 0;
        int j = 0;

        while((n - i) >= (m - j)){
            if(pattern.charAt(j) == string.charAt(i)){
                i++;
                j++;
            }
            if(j == m){
                System.out.println(i - j);
                j = lps[j - 1];
            }
            else if(i < n && pattern.charAt(j) != string.charAt(i)){
                if(j != 0){
                    j = lps[j - 1];
                }
                else{
                    i++;
                }
            }
        }


    }

    public static void longestprefixsuffix(String pattern,int[] lps,int m){
        int pre = 0;
        int suff = 1;
        lps[0] = 0;
        while (suff < m) {
            if(pattern.charAt(suff) == pattern.charAt(pre)){
                lps[suff] = pre + 1;
                pre++;
                suff++;
            }
            else{
                if(pre != 0){
                    pre = lps[pre - 1];
                }
                else{
                    suff++;
                }
            }
        }
    }
    public static void main(String[] args) {
        String string = "ABCDGHABDGFBHS";
        String pattern = "HAB";

        patternmatching(string, pattern);

        


    }
}
