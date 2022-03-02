package com.company;
import org.opencv.core.Core;

import java.text.ParseException;
import java.util.*;
public class Main {


    public static void main(String[] args) throws ParseException {


        Parse parse = new Parse();
        Library library = new Library();
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
        int x = 0;
        boolean loop = true;
        do {
            if(x<=user1.topThree.length) {

                System.out.println("Can i suggest " + user1.topThree[x] + " ?");
                String reply1 = sc.next();
                loop = chatBot.testReaction(reply1);
            }
            else {
                loop = false;
            }
        }while(loop);

        x = 0;
        loop = true;
        do {
            if(x<=user1.topThree.length) {

                System.out.println("Can i suggest " + user1.topThree[x] + " ?");
                String reply1 = sc.next();
                loop = chatBot.testReaction(reply1);
            }
            else {
                loop = false;
            }
        }while(loop);

    }

}
