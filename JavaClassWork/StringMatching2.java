public class StringMatching2 {

    public static int stringmatcher(String s1,String s2){
        int n = s1.length();
        int m = s2.length();

        for(int i=0;i<=n-m;i++){
            int first = i;
            int second = 0;
            while (second<m) {
                if(s1.charAt(first) != s2.charAt(second)){
                    break;
                }
                else{
                    first++;
                    second++;
                }
            }
            if (second == m) {
                return first - second;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        String s1 = "ABACDABAD";
        String s2 = "ABAD";

        System.out.println(stringmatcher(s1, s2));
    }
}

// this program has time complexity of O(mn);
