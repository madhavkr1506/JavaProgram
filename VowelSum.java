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
        NumMap.put(11, "eleven");
        NumMap.put(12, "twelve");
        NumMap.put(13, "thirteen");
        NumMap.put(14, "fourteen");
        NumMap.put(15, "fifteen");
        NumMap.put(16, "sixteen");
        NumMap.put(17, "seventeen");
        NumMap.put(18, "eighteen");
        NumMap.put(19, "nineteen");
        NumMap.put(20, "twenty");
        NumMap.put(30, "thirty");
        NumMap.put(40, "forty");
        NumMap.put(50, "fifty");
        NumMap.put(60, "sixty");
        NumMap.put(70, "seventy");
        NumMap.put(80, "eighty");
        NumMap.put(90, "ninety");

        ArrayList<Mapping> arrayList = new ArrayList<>();

        for(int i=0;i<num;i++){
            if(NumMap.containsKey(array[i])){
                arrayList.add(new Mapping(array[i], NumMap.get(array[i])));
            }else{
                int tenthplace = array[i] / 10 * 10;
                int unitplace = array[i] % 10;
                arrayList.add(new Mapping(array[i], NumMap.get(tenthplace)+"-"+NumMap.get(unitplace)));
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
