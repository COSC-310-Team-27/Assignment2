import java.text.ParseException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Parse parse = new Parse();
        Library library = new Library();
        ChatBot chatBot = new ChatBot();
        Person user1 = new Person();
        System.out.println(chatBot.getStatement(0));
        System.out.println(chatBot.getQuestion(0));
        user1.setName(parse.getWord());
        System.out.println(chatBot.getQuestion(1, user1.getName()));
        user1.setAge(parse.getWord());
        System.out.println(chatBot.getQuestion(2, user1.getName()));
        user1.setOccupation(parse.getWord());
        System.out.println(chatBot.getQuestion(3, user1.getName()));
        user1.setFavoriteBook(sc.next());
        System.out.println(chatBot.getQuestion(4, user1.getName()));
        user1.setFavoriteGenera(sc.next());
        PCA pca = new PCA(user1.getUserVector()); //create pca object using user1 person object
        user1.setUserVector();
        user1.setPcaVector(pca.getStandardUser());
        user1.setTopThree(pca.getTopThree());
        chatBot.loopGeneraTitle(user1,pca,pca.getTopThree(), false);
        System.out.println(chatBot.getStatement(1));
        String in = sc.nextLine();

        int gate = 1;
        while(gate == 1){
            //System.out.println("1");

            if(in.equalsIgnoreCase("random title")){
                System.out.println(chatBot.getStatement(13));
                Book ran = library.getTitleRandom();
                user1.updateTempList(ran);
                System.out.println(ran.getBookDetails());
            }
            else if(in.equalsIgnoreCase("random book in genre")){
                System.out.println("Search by genre: ");
                Book ran = library.getGeneraRand(sc.nextLine());
                user1.updateTempList(ran);
                System.out.println("Book(s) found: ");
                System.out.println(ran.getBookDetails());
            }
            else if(in.equalsIgnoreCase("title")){
                System.out.println("Search by title: ");
                Book ran = library.byTitle(sc.nextLine());
                user1.updateTempList(ran);
                System.out.println("Book(s) found: ");
                System.out.println(ran.getBookDetails());
            }
            else if(in.equalsIgnoreCase("author")){
                System.out.println("Search by author: ");
                Book ran = library.getAuthRand(sc.nextLine());
                user1.updateTempList(ran);
                System.out.println("Book(s) found: ");
                if(ran.getTitle() == null){
                    System.out.println(chatBot.getStatement(11));
                }
                else{
                    System.out.println(chatBot.getStatement(12));
                    System.out.println(ran.getBookDetails()); //try using break instead of else?
                }
            }
            else if(in.equalsIgnoreCase("pages")){
                System.out.println("Search by pages: ");
                Book ran = library.byPages(sc.nextLine());
                user1.updateTempList(ran);
                System.out.println(chatBot.getStatement(12));
                System.out.println("Book(s) found: ");
                System.out.println(ran.getBookDetails());
            }
            else if(in.equalsIgnoreCase("pca")){
                System.out.println("Quick questions!");
                System.out.println("These fast questions to get to know you won't end unless you type no after adding at least one book!");
                user1.setUserVector();
                user1.setPcaVector(pca.getStandardUser());
                //System.out.println("pass1");
                user1.setTopThree(pca.getTopThree());
                //System.out.println("pass2");
                chatBot.loopGeneraTitle(user1,pca,pca.getTopThree(), false);
            }

            else if(in.equalsIgnoreCase("getcartlist")){
                System.out.println(user1.getTempList().toString());
            }

            else{
                System.out.println("Service unavailable");

            }
            System.out.println(chatBot.getQuestion(6, user1.getName()));
            in = sc.nextLine();
            if(in.equalsIgnoreCase("yes")){
                System.out.println(chatBot.getQuestion(5, user1.getName()));
                in = sc.nextLine();
            }
            else{
                gate = 0;
                System.out.println("We look forward to your next visit!");
                break;
            }

        }

        System.out.println(chatBot.getQuestion(6, user1.getName()));

    }

}
