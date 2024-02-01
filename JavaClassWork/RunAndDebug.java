public class RunAndDebug {
    public static void main(String[] args) {
        String name = null;
        name = "Madhav";
        System.out.println(name);

        // iteration over letters
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            System.out.println(c);
        }
        System.out.println();
        
        // print downword stair of your name 
        for (int i = 0; i < name.length(); i++) {
            String c = name.substring(0,i+1);
            System.out.println(c);
        }


    }
}
