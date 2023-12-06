import java.util.Scanner;
public class AlwaysRemember {
    public static void main(String[] args){
        System.out.println("If fundamental rights of any Indian citizen is getting violated. He/she can file a petition under article 32 and article 226 to the Supreme court and State court (High court) respectively for enforcement of their fundamental rights.");
        System.out.println("Writs are the written document issued by Supreme court and High court of India for enforcement of fundamental rights.");
        System.out.println("There are five types of writs in India");
        System.out.println("1. Habeas Corpus");
        System.out.println("2. Prohibition");
        System.out.println("3. Mandamus");
        System.out.println("4. Certiorari");
        System.out.println("5. Qua-Warranto");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input = ");
        while(true){
            int choice = scanner.nextInt();
            switch(choice){
                case 1 :
                    System.out.println("Habeas Corpus ");
                    System.out.println("Supreme court/High court can issue this writ against both Public and Private Sector.");
                    System.out.println("This writ protect liberty of a person against unlawful detention, by enforcing fundamental right of individual liberty.");
                    System.out.println("According to this writ Supreme court/High court will issued an order to bring body of the detain individual.");
                    System.out.println("It can not be issued in the following cases : ");
                    System.out.println("1. When a Person is detain with lawful action.");
                    System.out.println("2. When detention is done outside the jurisdiction of court.");
                    System.out.println("3. When detention is competent by court.");
                    System.out.println("4. When the proceeding is for contempt of a legislature or a court.");
                    break;
                case 2:
                    System.out.println("Prohibition ");
                    System.out.println("");


                default:
                    System.exit(0);

            }
        }


    }
}
