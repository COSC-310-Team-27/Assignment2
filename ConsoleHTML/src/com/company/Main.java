package com.company;
import org.opencv.core.Core;

import java.util.*;
public class Main {


    public static void main(String[] args) {

        ChatBot chatBot = new ChatBot();
        Person user1 = new Person();
        System.out.println(chatBot.getStatement(0));
        System.out.println(chatBot.getQuestion(0));
        Scanner sc = new Scanner(System.in);
        user1.setName(sc.next());
        System.out.println(chatBot.getQuestion(1, user1.getName()));
        user1.setAge(sc.next());
        System.out.println(chatBot.getQuestion(2, user1.getName()));
        user1.setOccupation(sc.next());
        System.out.println(chatBot.getQuestion(3, user1.getName()));
        user1.setFavoriteBook(sc.next());
        System.out.println(chatBot.getQuestion(4, user1.getName()));
        user1.setFavoriteGenera(sc.next());
        PCA pca = new PCA(user1.getUserVector()); //create pca object using user1 person object
        user1.setUserVector();
        user1.setPcaVector(pca.getStandardUser());
        user1.setTopThree(pca.getTopThree());


        System.out.println(chatBot.getStatement(2, user1.topThree[0]));
        String reply1 = sc.next();
        String perception = chatBot.testReaction(reply1, user1);
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

}
