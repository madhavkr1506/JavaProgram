public class Practice17 {
    public static int stringMatching(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        for(int i=0;i<=m-n;i++){
            int first = i;
            int second = 0;
            while(second < n){
                if(s1.charAt(first) != s2.charAt(second)){
                    break;
                }
                else{
                    first++;
                    second++;
                }
            } 
            if(second == n){
                return first - second;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s1 = "ABACDABAD";
        String s2 = "ABAD";
        System.out.println(stringMatching(s1, s2));
    }
}
