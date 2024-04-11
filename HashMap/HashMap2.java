import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap2 {
    static HashMap<String ,String> bookshelves = new HashMap<>();
    public static void storeFunction(String bookName, String AuthorName){
        
        bookshelves.put(bookName, AuthorName);
    }

    public static void displayBook(){
        for(Map.Entry<String,String> book : bookshelves.entrySet()){
            System.out.println("Book name : "+book.getKey()+" || Author name : "+book.getValue());
        }
    }

    static HashMap<String,String> reHashMap = new HashMap<>();
    public static void bookIssue(String bookName, String AuthorName){
        if(bookshelves.containsKey(bookName)){
            reHashMap.put(bookName, AuthorName);
            bookshelves.remove(bookName);
        }
    }

    public static void displayIssuedbook(){
        for(Map.Entry<String,String> book : reHashMap.entrySet()){
            System.out.println("Book name : "+book.getKey()+" || Author name : "+book.getValue());
        }
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------Books of world---------------------------------");
        try{
            while(true){
                System.out.println("Following action you can perform : ");
                System.out.println("1. Store book in library : ");
                System.out.println("2. Display available book in the library : ");
                System.out.println("3. Book issue : ");
                System.out.println("4. List all Issued book : ");
                System.out.println("Press 0 for exit");

                System.out.println("\n\nEnter your choice : ");
                int choice = sc.nextInt();
                sc.nextLine();

            
                switch (choice) {
                    case 1:
                        System.out.println("Enter book name and their Author name : ");
                        System.out.println("Enter book name : ");
                        String Book = sc.nextLine();
                        System.out.println("Enter author name : ");
                        String Author = sc.nextLine();
                        
                        
                        storeFunction(Book, Author);
                        System.out.println("Congratulation! you have store this book in your library");
                        
                        break;
                    
                    case 2:
                        System.out.println("Books available in the library : ");
                        displayBook();
                        break;

                    case 3:
                        System.out.println("Book Issued : ");
                        System.out.println("Enter book name : ");
                        String bookforIssue = sc.nextLine();
                        System.out.println("Enter Author name : ");
                        String AuthorName = sc.nextLine();

                        bookIssue(bookforIssue,AuthorName);

                        System.out.println("You have successfully issued your book");

                        break;

                    case 4:
                        System.out.println("List all the book that has been issued : ");
                        displayIssuedbook();
                        break;

                
                    default:
                        sc.close();
                        System.exit(0);
                }
            }
        }
        catch(NumberFormatException e){
            System.out.println("Invalid input format. Please enter a Number.");
        }catch(Exception e){
            System.out.println("error occurred : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
