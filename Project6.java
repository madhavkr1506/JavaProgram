import java.util.Scanner;
interface function{
    void addBook(String book_name,String Author_name);
    void displayBook(String book_name);
    void displayShelf();
    void issueBook(String book_name);
}
class Book implements function{
    String bookShelf[] = new String[100];
    int index = 0;
    public void addBook(String book_name,String Author_name){

        bookShelf[index] = (book_name + " --> " + Author_name);
        index++;
    }

    public void displayBook(String book_name){
        boolean isFound = false;
        for(int i=0;i<bookShelf.length;i++){
            if(bookShelf[i] != null && bookShelf[i].contains(book_name)){
                isFound = true;
                String[] parts = bookShelf[i].split(" --> ");
                System.out.println("Book details are --> Book Name :  " + parts[0] + " and Author Name :  " + parts[1]);
                break;
            }
        }
        if(!isFound){
            System.out.println(book_name + " is not available in the library");
        }
    }
    String issuedBook[] = new String[100];
    int index2 = 0;
    public void displayShelf(){
        for(int i=0;i<bookShelf.length;i++){
            if(bookShelf[i] != null && !isBookIssued(bookShelf[i].split(" --> ")[0])) {
                String[] parts = bookShelf[i].split(" --> ");
                System.out.println("Book Name [ " + parts[0] + " ] and Author Name [ " + parts[1] + " ]");
            }
        }
    }
    public void issueBook(String book_name){
        issuedBook[index2] = book_name;
        index2++;
    }
    private boolean isBookIssued(String book) {
        for (int i = 0; i < issuedBook.length; i++) {
            if (issuedBook[i] != null && issuedBook[i].contains(book)) {
                return true;
            }
        }
        return false;
    }
}
public class Project6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book obj1 = new Book();
        String books[] = new String[100];
        for(int i=0;i<5;i++){
            System.out.print("Enter book name : ");
            String book_name = scanner.nextLine();
            System.out.print("Enter author name : ");
            String author_name = scanner.nextLine();
            obj1.addBook(book_name,author_name);
        }
//        System.out.print("Enter book name to search : ");
//        String bookName = scanner.next();
//        obj1.displayBook(bookName);

        System.out.println("Which book you want to issue : ");
        String issueBook = scanner.nextLine();
        obj1.issueBook(issueBook);

        System.out.println("Displaying remaining books available in the library : ");
        obj1.displayShelf();
    }
}
