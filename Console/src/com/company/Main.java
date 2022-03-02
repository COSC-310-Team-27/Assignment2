package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quiz q = new Quiz();

        Patterns p1 = new Patterns();
        String w1 = p1.getWelcome();
        String i1 = p1.getIntro();
        ChatBot chatBot = new ChatBot();
        Person user1 = new Person();

        System.out.println("Lets Play a game! Answer eg 1,2,3,4\n");
        q.play();




/*
        System.out.println(w1);
        user1.setName(sc.next());
        System.out.println(user1.getName() + i1);
        String s1 = sc.next();
        System.out.println( user1.getName() + p1.getLit(s1));
        String s2 = sc.next();
        System.out.println( user1.getName() + p1.getGenre(s2));
        String s3 = sc.next();
        System.out.println( user1.getName() + p1.getGenreType(s3));

        user1.setFavoriteBook(sc.next());

        PCA reduce = new PCA(user1.getUserVector());
        */

/*
=======
    public static void main(String[] args) throws ParseException {


        Parse parse = new Parse();

        Library library = new Library();
>>>>>>> 8ef550cf6907e5f43bc1a9c5c17ceb7fdef5d0fc
        ChatBot chatBot = new ChatBot();
        Person user1 = new Person();
        System.out.println(chatBot.getStatement(0));
        System.out.println(chatBot.getQuestion(0));
        Scanner sc = new Scanner(System.in);
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



        //System.out.println(chatBot.getStatement(2, user1.topThree[0]));

        //ArrayList<Book> generaMatch = library.getGeneras(user1.topThree[0]);
        System.out.println("best genera"+ user1.topThree[0]);


        String reply1 = sc.next();
        String perception = chatBot.testReaction(reply1, user1);
        /*TODO
            find a way to loop this switch case until user is satisfied


        do {
            switch (perception) {
                case ("no"): {
                    System.out.println(chatBot.getStatement(3, user1.topThree[1]));
                }
                case ("yes"): {
                    System.out.println(chatBot.getStatement(4, user1.topThree[0]));
                }
                case ("unsure"): {
                    System.out.println(chatBot.getStatement(5, user1.topThree[0]));
                }
            }

            reply1 = sc.next();
            perception = chatBot.testReaction(reply1, user1);
        }while (perception != "yes");



    }
*/
    }
}
