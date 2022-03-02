package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        ChatBot chatBot = new ChatBot();
        Person user1 = new Person();
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);
        int gate = 1;
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
        System.out.println("inting: "+ in);

        while(gate == 1){
            System.out.println("1");
            if(in.equalsIgnoreCase("random")){
                System.out.println("random");
            }
            else if(in.equalsIgnoreCase("favourite book")){
                System.out.println("fav b");
            }
            else if(in.equalsIgnoreCase("favourite genre")){
                System.out.println("fav g");

            }
            else if(in.equalsIgnoreCase("title")){
                System.out.println("title");

            }
            else if(in.equalsIgnoreCase("pages")){
                System.out.println("pages");
            }
            else if(in.equalsIgnoreCase("author")){
                System.out.println("author");
            }
            else{
                System.out.println("Service unavailable");

            }
            System.out.println(chatBot.getQuestion(6, user1.getName()));
            in = sc.next();
            System.out.println("in: "+ in);
            if(in.equalsIgnoreCase("yes")){
                continue;
            }
            else{
                gate = 0;
            }

        }






    }


    public String randomRec(Library lib, Person p){
        int ran = (int) Math.floor(Math.random()*lib.getBookList().size());
        p.updateTempList(lib.getBookList().get(ran));
        return lib.getBookList().get(ran).toString();
    }
}
