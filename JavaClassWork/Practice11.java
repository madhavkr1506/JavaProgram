public class Practice11 {
    public static void main(String[] args) {
        // int n = 5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<i;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=n;j>=i;j--){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        // write a program and print half of the string will be in lowercase and half of the string will be in uppercase : 
        // String str = "abcdefghij";
        // System.out.println(str.substring(0, str.length()/2).toLowerCase() + " " + str.substring(str.length()/2, str.length()).toUpperCase());

        // Math function : 

        // double d1 = 145.1515d;
        // System.out.println("round : " + Math.round(d1));
        // System.out.println("ceil : " + Math.ceil(d1));
        // System.out.println("floor : " + Math.floor(d1));

        // write a program to check whether two strings are having same alphabet or not : 

        String str1 = "abcde";
        String str2 = "edcba";
        int count = 0;
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    count++;
                }
            }
        }
        if(count == str2.length()){
            System.out.println("yes both string have same alphabet");
        }
        else{
            System.out.println("Both string do not have same alphabet");
        }


    }
}
