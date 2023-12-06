import java.util.Scanner;
public class AlwaysRemember {
    public static void main(String[] args){
        System.out.println("If fundamental rights of any Indian citizen is getting violated. He/she can file a petition under article 32 and article 226 to the Supreme court and State court (High court) respectively for enforcement of their fundamental rights.");
        System.out.println("Writs are the written document issued by Supreme court and High court of India for enforcement of fundamental rights.");
        System.out.println("In 1950, only high court of madras, bombay, calcutta had power to issue this writ. ");
        System.out.println("Writ of india are borrowed from English law where they are known as Prerogative writ.");
        System.out.println("Article 32 also empower parliament to authorize any court to issue these writs.");
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
                    System.out.println("Important case : Rudul shah vs State of bihar");
                    break;
                case 2:
                    System.out.println("Mandamus ");
                    System.out.println("Meaning : We Command");
                    System.out.println("This writ will be issued by the court to order the public officials who has fallen to perform his duty, to resume his work.");
                    System.out.println("Mandamus can be issued against any public body, a corporation, an inferior court, a tribunal, or government for the same purpose.");
                    System.out.println("Mandamus cannot be issued against President or state governors.");
                    System.out.println("Mandamus cannot be issued against the chief justice of a high court acting in a judicial capacity.");
                    System.out.println("Mandamus can not be issued to enforce contractual obligation.");
                    System.out.println("Important case : Gujarat state financial corporation vs Lotus hotel");
                    break;
                case 3:
                    System.out.println("Certiorari ");
                    System.out.println("Meaning : To be certified.");
                    System.out.println("Higher court review the judgement of lower court. If Higher court found that judgement was not done under the jurisdiction or it was done under unlawful activity/nature, Higher court has power to quash their order.");
                    System.out.println("This writ cannot be issued against legislative bodies and private individuals or bodies.");
                    System.out.println("Pre 1991 : This writ can be issued only against judicial and quasi-judicial bodies, not against administrative bodies.");
                    System.out.println("Post 1991 : This writ can be issued against administrative bodies.");
                    System.out.println("Important cases : 1. Gullapalli Nageshwar vs APSRTC\n2. A.K Kripak vs Union of india");
                    break;
                case 4 :
                    System.out.println("Prohibition vs Certiorari");
                    System.out.println("Prevention is better then cure");
                    System.out.println("Meaning : To forbid");
                    System.out.println("This writ can be issued against judicial and quasi judicial bodies.");
                    System.out.println("This writ can not be issued aginst administrative bodies, legislative bodies, private individuals or bodies.");
                    System.out.println("In the case of False/unlawful judgement, Higher court issue this writ against lower court before the judgement has been announced. If the judgement has been announced then Certiorari writ will be issued.");
                    break;
                case 5:
                    System.out.println("Quo Warranto ");
                    System.out.println("Meaning : By what authority");
                    System.out.println("Higher court can ask public officer that which authority has assign him office.");
                    System.out.println("It can not be issued against private or ministerial office.");
                    break;
                default:
                    System.exit(0);

            }
        }


    }
}
