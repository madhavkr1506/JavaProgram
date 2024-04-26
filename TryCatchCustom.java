import java.util.*;

class CustomException extends Exception{
    public CustomException(){
        super("Invalid input type");
    }
}






public class TryCatchCustom {

    public static void checKValidCreditCardNumber(String CardNumber)throws CustomException{
        if(!CardNumber.matches("\\d{4}-\\d{4}-\\d{4}-\\d{4}")){
            throw new CustomException();
        }
        else{
            System.out.println("It is a valid Card Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        try{
            String CardNumber = sc.nextLine();
            checKValidCreditCardNumber(CardNumber);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
