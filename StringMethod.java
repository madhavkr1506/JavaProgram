import java.util.Scanner;
public class StringMethod {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = "MadhavKumar";

//        System.out.println(name);
//        int value=name.length();
//        System.out.println(value);
//        System.out.println(name.toLowerCase());
//        String lstring=name.toLowerCase();
//        System.out.println(lstring);
//        String ustring = name.toUpperCase();
//        System.out.println(ustring);

//        String nonTrimString = "            Madhav          ";
//        System.out.println(nonTrimString);
//        System.out.println(nonTrimString.trim());

//        System.out.println(name.substring(3));
//        System.out.println(name.substring(3,5));

//        System.out.println(name.replace('a','v'));
        System.out.println(name.replace("av","xi"));

//        System.out.println(name.startsWith("Mad"));
//        System.out.println(name.endsWith("yr"));

//        System.out.println(name.charAt(2));

//        System.out.println(name.indexOf("K"));

//        System.out.println(name.indexOf("a",5));
//        System.out.println(name.lastIndexOf("r"));
        System.out.println(name.lastIndexOf("a",6));

//        System.out.println(name.equals("madhavkumar"));
//        System.out.println(name.equals("MadhavKumar"));

//        System.out.println(name.equalsIgnoreCase("madhavkumar"));

        System.out.println("I am escape sequence \" double quote");




    }
}
