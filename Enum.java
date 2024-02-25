public class Enum {
    public static enum Color{
        Red,Yellow,Pink,Green;
    }
    public static void main(String[] args) {
        // Color color = Color.Red;
        // System.out.println(color.Red);
        Color color[] = Color.values();
        for(Color value : color){
            System.out.println(value);
        }
    }
}
