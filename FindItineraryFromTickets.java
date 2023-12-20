import java.util.HashMap;
class Classroom{
    public String function1(HashMap<String, String> map1){
        HashMap<String,String> mapRev = new HashMap<>();
        for(String ele : map1.keySet()){
            mapRev.put(map1.get(ele),ele);
        }
        for(String ele : map1.keySet()){
            if(!mapRev.containsKey(ele)){
                return ele;
            }
        }
        return null;
    }
}
public class FindItineraryFromTickets {
    public static void main(String[] args) {
        HashMap<String,String> map1 = new HashMap<>();
        map1.put("Chennai","Bengaluru");
        map1.put("Mumbai","Delhi");
        map1.put("Goa","Chennai");
        map1.put("Delhi","Goa");
        Classroom obj1 = new Classroom();
        String start = obj1.function1(map1);
//        System.out.println(start);
        while(map1.containsKey(start)){
            System.out.print(start + " --> ");
            start = map1.get(start);
        }
        System.out.println(start);

    }
}
