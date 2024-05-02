import java.io.IOException;
import java.io.StringReader;
import java.util.*;

class Mapping{
    int num;
    String value;
    Mapping(int num,String value){
        this.num = num;
        this.value = value;
    }
}
public class VowelSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length : ");
        int num = sc.nextInt();
        int[] array = new int[num];
        for(int i=0;i<num;i++){
            System.out.println("Enter "+(i+1)+"th index : ");
            array[i] = sc.nextInt();
        }
        HashMap<Integer,String> NumMap = new HashMap<>();
        NumMap.put(1, "one");
        NumMap.put(2, "two");
        NumMap.put(3, "three");
        NumMap.put(4, "four");
        NumMap.put(5, "five");
        NumMap.put(6, "six");
        NumMap.put(7, "seven");
        NumMap.put(8, "eight");
        NumMap.put(9, "nine");
        NumMap.put(10, "ten");

        ArrayList<Mapping> arrayList = new ArrayList<>();

        for(int i=0;i<num;i++){
            if(NumMap.containsKey(array[i])){
                arrayList.add(new Mapping(array[i], NumMap.get(array[i])));
            }
        }

        int vowelCount = 0;
        ArrayList<Integer> vowelArrayCount = new ArrayList<>();
        
        for(Mapping e : arrayList){
            String item = e.value;
            try(StringReader read = new StringReader(item)){
                int i;
                while((i = read.read())!= -1){
                    char ch = (char)i;
                    if("aeiou".indexOf(ch) != -1){
                        vowelCount++;
                        vowelArrayCount.add(vowelCount);
                        vowelCount = 0;
                    }
                }
            }catch(IOException a){
                System.out.println(a.getMessage());
            }
            
        }

        int sum = 0;
        for(int i=0;i<vowelArrayCount.size();i++){
            sum+=vowelArrayCount.get(i);
        }
        
        for(int i=0;i<num-1;i++){
            for(int j=i+1;j<num;j++){
                if(array[i]+array[j] == sum){
                    System.out.println(array[i] + " " + array[j]);
                }
            }
        }
        for(Map.Entry<Integer,String> e : NumMap.entrySet()){
            if(e.getKey() == sum){
                System.out.println(e.getValue());
            }
        }
        sc.close();
    }
}
