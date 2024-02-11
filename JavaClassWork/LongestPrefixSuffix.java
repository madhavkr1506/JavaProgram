

public class LongestPrefixSuffix {

    public static void printsubstring(String s){
        for(int i=0;i<s.length();i++){
            System.out.println(s.substring(0, i+1));
        }
    }

    public static int longestprefixsuffix(String s){
        int[] array = new int[s.length()];

        int pre = 0;
        int suf = 1;
        while(suf < s.length()){
            if(s.charAt(suf) == s.charAt(pre)){
                array[suf] = pre + 1;
                suf++;
                pre++;
            }
            else{
                if(pre == 0){
                    suf++;
                }
                else{
                    pre = array[pre - 1];
                }
            }
        }
        return array[s.length() - 1];

    }


    public static void main(String[] args) {
        String string = "ABCABDABCABCABD";
        // System.out.println(string.length());
        // printsubstring(string);

        System.out.println(longestprefixsuffix(string));


    }
}
