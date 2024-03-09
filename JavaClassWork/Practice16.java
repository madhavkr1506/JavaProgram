public class Practice16 {

    public static int longestprefixsuffix(String s){
        int array[] = new int[s.length()];
        int prefix = 0;
        int suffix = 1;
        while(suffix < s.length()){
            if(s.charAt(suffix) == s.charAt(prefix)){
                array[suffix] = prefix + 1;
                suffix++;
                prefix++;
            }
            else{
                if(prefix == 0){
                    suffix++;
                }
                else{
                    prefix = array[prefix - 1];
                }
            }
        }

        return array[s.length() - 1];
    }
    public static void main(String[] args) {
        String string = "ABCABDABCABCABD";
        System.out.println(longestprefixsuffix(string));
    }
}
