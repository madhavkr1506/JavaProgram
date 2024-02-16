

public class Practice4 {
    public static void main(String[] args) {
        String s1 = "tytfgndsaepaasa";
        boolean found = false;
        for(int i=0;i<s1.length()-2;i++){
            if(s1.substring(i, i+2).equals("sa")){
                found =  true;
            }
        }
        if(found){
            System.out.println(found);
        }
    }
}
