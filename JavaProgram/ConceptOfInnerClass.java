import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface features{
    void model(String string);
    void mfgyear(LocalDate date);
    void color(String string);
    void fueltype(String string);
    void mileage(int mileage);
}


public class ConceptOfInnerClass{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input car details");
        System.out.println("Enter model number : ");
        String modelNumber = sc.nextLine();
        System.out.println("Enter Manufacturing year : ");
        String mfgYear = sc.nextLine();
        LocalDate mfgDate = LocalDate.parse(mfgYear,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("Enter color of the car : ");
        String color = sc.nextLine();
        System.out.println("Enter mileage : ");
        int mileage = sc.nextInt(); 
        sc.close();
    }
}