package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        ChatBot chatBot = new ChatBot();
        Person user1 = new Person();
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);
        String in = "";

        System.out.println(chatBot.getStatement(0));
        System.out.println(chatBot.getQuestion(0));
        user1.setName(sc.next());
        System.out.println(chatBot.getQuestion(1, user1.getName()));
        user1.setAge(sc.next());
        System.out.println(chatBot.getQuestion(2, user1.getName()));
        user1.setOccupation(sc.next());
        System.out.println(chatBot.getQuestion(3, user1.getName()));
        user1.setFavoriteBook(sc.next());
        System.out.println(chatBot.getQuestion(4, user1.getName()));
        user1.setFavoriteGenera(sc.next());
        System.out.println(chatBot.getQuestion(5, user1.getName()));
        in = sc.next();
        if(in.substring(0, 6).equalsIgnoreCase("random")){

        }
        else if(in.equalsIgnoreCase("favourite book")){

        }
        else if(in.equalsIgnoreCase("favourite genre")){

        }
        else if(in.equalsIgnoreCase("title")){

        }
        else if(in.equalsIgnoreCase("pages")){

        }
        else if(in.equalsIgnoreCase("author")){

        }
        else{
            System.out.println("Service unavailable");

        }




    }


    public void randomRec(Library lib){
        for (int i = 0; i < lib.get; i++) {

        }
    }
}
