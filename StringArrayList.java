import java.util.*;


public class StringArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ArrayList<String> StringArray = new ArrayList<>();
        // ArrayList<Integer> IntegerArray = new ArrayList<>();

        // while(sc.hasNextInt()){
        //     IntegerArray.add(sc.nextInt());
        // }
        
        // for(int x : IntegerArray){
        //     System.out.println(x);
        // }


        // for(int i=0;i<StringArray.size();i++){
        //     IntegerArray.add(Integer.parseInt(StringArray.get(i)));
        // }

        // for(int x : IntegerArray){
        //     System.out.println(x);
        // }

        
        String Scores[] = sc.nextLine().split(" ");
        
        
        for(String x : Scores){
            if(x.equals("done")){
                break;
            }
            System.out.println(x);
        }



        sc.close();
    }
}
