package com.company;

import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        Quiz q = new Quiz();

        Patterns p1 = new Patterns();
        ChatBot chatBot = new ChatBot();
        Person user1 = new Person();


        System.out.println(p1.getWelcome());
        user1.setName(sc.next());
        System.out.println(user1.getName() + p1.getIntro());
        String s1 = sc.next();
        System.out.println(user1.getName() + p1.getRobot(s1));
        s1 = sc.nextLine();
        System.out.println(user1.getName() + p1.getRobot(s1));
        s1 = sc.nextLine();
        System.out.println(user1.getName() + p1.getRobot(s1));
        s1 = sc.nextLine();
        System.out.println(user1.getName() + p1.getRobot(s1));
        s1 = sc.nextLine();

        if (s1 == "test me" || s1 == "quiz" || s1 == "tst") {
            s1 = "test me";
            System.out.println(user1.getName()); q.play();
        }else{
                System.out.println(user1.getName() + p1.getLit(s1));
                String s2 = sc.next();
                System.out.println(user1.getName() + p1.getGenre(s2));
                String s3 = sc.next();
                System.out.println(user1.getName() + p1.getGenreType(s3));
            }

/*
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
        */

    }

}

