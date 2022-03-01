package com.company;
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
    }
}
