import java.util.ArrayList;

public class Lambda1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(101);
        array.add(102);
        array.add(103);
        array.add(104);
        array.add(105);
        array.add(106);

        array.forEach(oddNumber->{if(oddNumber % 2 != 0){
            System.out.println(oddNumber);
        }});

    }
}
