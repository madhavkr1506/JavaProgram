public class Practice18 {

    public static void stringmatching(String txt,String pat){
        int m = txt.length();
        int n = pat.length();
        int[] lps = new int[n];

        lps(pat, n, lps);
        int i=0;
        int j=0;
        while((m - i) >= (n - j)){
            if(pat.charAt(j) == txt.charAt(i)){
                i++;
                j++;
            }
            if(j == n){
                System.out.println("Index found at " + (i - j));
                j = lps[ j - 1];
            }
            else if(i<m && pat.charAt(j) != txt.charAt(i)){
                if(j == 0){
                    i++;
                }
                else{
                    j = lps[j - 1];
                }
            }
        }
    }
    public static void lps(String pat,int n,int[] lps){
        int pre = 0;
        int suf = 1;
        lps[0] = 0;
        while(n < pat.length()){
            if(pat.charAt(suf) == pat.charAt(pre)){
                lps[suf] = pre + 1;
                suf++;
                pre++;
            }
            else{
                if(pre == 0){
                    lps[suf] = pre;
                    suf++;
                }
                else{
                    pre = lps[pre - 1];
                }
            }
        }
    }
    public static void main(String[] args) {
        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";

        stringmatching(txt, pat);
    }
}
