// longest suffix and prefix : 

public class Array33 {
    public static void main(String[] args) {
        String string = "ABCDGHABDGFBHS";
        String pattern = "HAB";

        int n = string.length();
        int m = pattern.length();

        for(int i=0;i<n-m;i++){
            int first = i;
            int second = 0;
            while(second < m){
                if(string.charAt(first) != pattern.charAt(second)){
                    break;
                }
                else{
                    first++;
                    second++;
                }
            }
            if(second == m){
                System.out.println(first - second);
            }
        }
    }
}
