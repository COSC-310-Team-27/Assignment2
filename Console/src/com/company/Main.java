package com.company;

import java.text.ParseException;
import java.util.*;
public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Parse parse = new Parse();
        Library library = new Library();
        ChatBot chatBot = new ChatBot();
        Person user1 = new Person();
        String in = "";

        System.out.println(chatBot.getStatement(0));
        System.out.println(chatBot.getQuestion(0));
        user1.setName(parse.getWord());
        System.out.println(chatBot.getQuestion(1, user1.getName()));
        user1.setAge(parse.getWord());
        System.out.println(chatBot.getQuestion(2, user1.getName()));
        user1.setOccupation(parse.getWord());
        System.out.println(chatBot.getQuestion(3, user1.getName()));
        user1.setFavoriteBook(sc.nextLine());
        System.out.println(chatBot.getQuestion(4, user1.getName()));
        user1.setFavoriteGenera(sc.nextLine());
        PCA pca = new PCA(user1.getUserVector()); //create pca object using user1 person object
        user1.setUserVector();
        user1.setPcaVector(pca.getStandardUser());
        user1.setTopThree(pca.getTopThree());
        System.out.println(chatBot.getQuestion(5, user1.getName()));
        System.out.println(chatBot.getStatement(1));
        in = sc.nextLine();

        int gate = 1;
        while(gate == 1){
            //System.out.println("1");

            if(in.equalsIgnoreCase("random title")){
                System.out.println(chatBot.getStatement(13));
                Book ran = library.getTitleRandom();
                user1.updateTempList(ran);
                System.out.println(ran.getBookDetails());
            }
            else if(in.equalsIgnoreCase("random genre")){
                System.out.println("Search by title: ");
                Book ran = library;
                user1.updateTempList(ran);
                System.out.println("Book(s) found: ");
                System.out.println(ran.getBookDetails());
            }
            else if(in.equalsIgnoreCase("random author")){
                Book ran = library.getAuthRand();
                user1.updateTempList(ran);
                System.out.println("Book(s) found: ");
                System.out.println(ran.getBookDetails());
            }
            else if(in.equalsIgnoreCase("title")){
                System.out.println("Search by title: ");
                Book ran = library.getTitleRandom();
                user1.updateTempList(ran);
                System.out.println("Book(s) found: ");
                System.out.println(ran.getBookDetails());
            }
            else if(in.equalsIgnoreCase("author")){
                System.out.println("Search by author: ");
                Book ran = library.getAuthRand();
                user1.updateTempList(ran);
                System.out.println(chatBot.getStatement(12));
                System.out.println("Book(s) found: ");
                System.out.println(ran.getBookDetails());
            }

            else if(in.equalsIgnoreCase("getcartlist")){
                System.out.println(user1.getTempList().toString());
            }

            else{
                System.out.println("Service unavailable");

            }
            System.out.println(chatBot.getQuestion(6, user1.getName()));
            in = sc.nextLine();
            //System.out.println("in: "+ in);
            if(in.equalsIgnoreCase("yes")){
                System.out.println(chatBot.getQuestion(5, user1.getName()));
                in = sc.nextLine();
            }
            else{
                gate = 0;
                System.out.println("We look forward to your next visit!");//Output templist or permlist? or something else.
                break;
            }


        }

        System.out.println(chatBot.getQuestion(6, user1.getName()));

        chatBot.loopGeneraTitle(user1,pca,pca.getTopThree(), false);
    }

}
