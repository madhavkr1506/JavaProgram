public class StringMatching3 {

    public static void kmpSearch(String txt,String pat){
        int m = txt.length();
        int n = pat.length();

        int lps[] = new int[n];

        computeLps(pat,n,lps);
        int i=0;
        int j=0;
        while((m-i) >= (n-j)){
            if(pat.charAt(j) == txt.charAt(i)){
                j++;
                i++;
            }
            if(j == n){
                System.out.println("index found at "+(i-j));
                j = lps[j-1];
            }
            else if(i<m && pat.charAt(j) != txt.charAt(i)){
                if(j != 0){
                    j = lps[j-1];
                }
                else{
                    i++;
                }
            }
        }

    }
    public static void computeLps(String pat,int m,int[] lps){
        int pre = 0;
        int suffix = 1;
        lps[0] = 0;
        while(suffix < m){
            if(pat.charAt(suffix) == pat.charAt(pre)){
                lps[suffix] = pre + 1;
                pre++;
                suffix++;
            }
            else{
                if(pre == 0){
                    lps[suffix] = pre;
                    suffix++;
                }
                else{
                    pre = lps[pre-1];
                }
            }
        }
    }
    public static void main(String[] args) {
        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        kmpSearch(txt, pat);
    }
}
