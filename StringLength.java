import java.util.Scanner;
public class StringLength {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string1=scanner.nextLine();
//        stringLength(string1);
        System.out.println(reverse(string1));
    }
//    static void stringLength(String word){
//        int i;
//        for(i=0;i<word.length();i++){
//            if(word.charAt(i)=='\0'){
//                break;
//            }
//        }
//        System.out.println(i);
//    }

    static String reverse(String word){
        char[] rev=word.toCharArray();
        int start=0;
        int last=rev.length-1;
        while(start < last){
            char temp=rev[start];
            rev[start]=rev[last];
            rev[last]=temp;
            start++;
            last--;
        }
        return new String(rev);

    }
}
