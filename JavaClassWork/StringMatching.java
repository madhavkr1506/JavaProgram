public class StringMatching {
    // public static void stringmatch(String s1,String s2){
    //     for(int i=0;i<s1.length();i++){
    //         for(int j=0;j<s2.length();j++){
    //             if(s1.charAt(i) == s2.charAt(j)){
    //                 System.out.println(s1.charAt(i));
    //                 break;
    //             }
    //         }
    //     }
    // }

    public static boolean stringmatch(String s1,String s2){
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "ABCABCDHGKFNVOIV";
        String s2 = "DHG";

        System.out.println(stringmatch(s1, s2));
        // stringmatch(s1, s2);
    }
}
