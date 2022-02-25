package com.company;
import org.opencv.core.Core;

import java.util.*;
public class Main {


    public static void main(String[] args) {

        ChatBot chatBot = new ChatBot();
        Person user1 = new Person();


        int [][] utility = new int [][] {{10,1,10,0,5,2,2},{0,10,1,10,5,2,2},{0,1,1,0,10,10,2},{8,1,1,1,5,4,8}};//standard user matrix reduced via PCA in python
        int [] distances = new int[utility.length];


        int [] user = new int [] {10,1,1,0,-1,2,2};
        PCA pca = new PCA(user);
        int [] d = pca.getDistances();
        System.out.println(d);
        //pca.getTop();
        System.out.println(pca.getTop());
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

        System.out.println(chatBot.getStatement(1, pca.getTop())+" the genera");
        user1.setFavoriteGenera(sc.next());
    }

}
