import java.util.*;

public class StringPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = "Madhav kumar";
        // char ch[] = str.toCharArray();
        // System.out.println(ch.length);
        // Arrays.sort(ch);
        // for(int i=0;i<ch.length;i++){
        //     if(Character.isUpperCase(ch[i])){
        //         System.out.println(ch[i] + " is upper case");
        //     }
        // }

        ArrayList<Integer> array = new ArrayList<>();

        
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            array.add(num);
            
        }

        for(int i : array){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
