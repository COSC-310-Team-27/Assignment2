package com.company;
import java.util.*;




public class Main {

    public static Book randomRec(Library l, Person p){
        int ran = (int) Math.floor(Math.random()*l.getBookList().size());
        return l.getBookList().get(ran);
    }

    public static Book favB(Library l, Person p){
        Book b = new Book();
        int a = 1;
        for (int i = 0; i < l.getBookList().size(); i++) {
            if(p.getFavoriteBook().equalsIgnoreCase(l.getBookList().get(i).getTitle())){ //In the future: include books with multiple vol or series
                b = l.getBookList().get(i);
            }
        }
        return b;
    }
    public static Book favG(Library l, Person p){
        Book b = new Book();
        ArrayList<Book> temp = new ArrayList<Book>();
        int a = 1;
        int ran = 0;
        for (int i = 0; i < l.getBookList().size(); i++) {
            if(p.getFavoriteGenera().equalsIgnoreCase(l.getBookList().get(i).getGenre())){ //In the future: include books with multiple vol or series
                temp.add(l.getBookList().get(i));
            }
        }
        if(temp.size()>0){ //Necessary?
            //ran = (int) Math.round(Math.random()*temp.size());
            b = temp.get(ran);
        }
        return b;
    }
    public static Book byTitle(Library l, Person p, String s){ //In the future return list, from which user can pick from.
        Book b = new Book();
        ArrayList<Book> temp = new ArrayList<Book>();
        int a = 1;
        int ran = 0;
        for (int i = 0; i < l.getBookList().size(); i++) {
            if(s.equalsIgnoreCase(l.getBookList().get(i).getTitle())){
                temp.add(l.getBookList().get(i));
            }
        }
        if(temp.size()>1){ //Necessary?
            ran = (int) Math.floor(Math.random()*temp.size());
            b = temp.get(ran);
        }
        else if(temp.size() == 1){
            b = temp.get(0);
        }
        return b;
    }

    public static Book byPages(Library l, Person p, String s){ //In the future return list, from which user can pick from. And perhaps within a range of the inputted pages
        Book b = new Book();
        ArrayList<Book> temp = new ArrayList<Book>();
        int a = 1;
        int ran = 0;
        int k = Integer.parseInt(s);
        for (int i = 0; i < l.getBookList().size(); i++) {
            if(k == l.getBookList().get(i).getPages()){
                temp.add(l.getBookList().get(i));
            }
        }
        if(temp.size()>1){ //Necessary?
            ran = (int) Math.floor(Math.random()*temp.size());
            System.out.println(ran);
            b = temp.get(ran);
        }
        else if(temp.size() == 1){
            b = temp.get(0);
        }
        return b;
    }
    public static Book byAuthor(Library l, Person p, String s){ //In the future return list, from which user can pick from.
        Book b = new Book();
        ArrayList<Book> temp = new ArrayList<Book>();
        int a = 1;
        int ran = 0;
        for (int i = 0; i < l.getBookList().size(); i++) {
            if(s.equalsIgnoreCase(l.getBookList().get(i).getAuthor())){
                temp.add(l.getBookList().get(i));
            }
        }
        if(temp.size()>1){ //Necessary?
            ran = (int) Math.round(Math.random()*temp.size());
            b = temp.get(ran);
        }
        else if(temp.size() == 1){
            b = temp.get(0);
        }
        return b;
    }

    public static void main(String[] args) {

        ChatBot chatBot = new ChatBot();
        Person user1 = new Person();
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);
        int gate = 1;
        String in = "";

        System.out.println(chatBot.getStatement(0));
        System.out.println(chatBot.getQuestion(0));
        user1.setName(sc.nextLine());
        System.out.println(chatBot.getQuestion(1, user1.getName()));
        user1.setAge(sc.nextLine());
        System.out.println(chatBot.getQuestion(2, user1.getName()));
        user1.setOccupation(sc.nextLine());
        System.out.println(chatBot.getQuestion(3, user1.getName()));
        user1.setFavoriteBook(sc.nextLine());
        System.out.println(chatBot.getQuestion(4, user1.getName()));
        user1.setFavoriteGenera(sc.nextLine());
        System.out.println(chatBot.getQuestion(5, user1.getName()));
        in = sc.nextLine();
        //System.out.println("in 1st: "+ in);

        while(gate == 1){
            //System.out.println("1");
            if(in.equalsIgnoreCase("random")){
                System.out.println("A book chosen by the gods: ");
                Book ran = randomRec(lib, user1);
                user1.updateTempList(ran);
                System.out.println(ran.getBookDetails());
            }
            else if(in.equalsIgnoreCase("favourite book")){
                System.out.println("Based on your favourite book I would recommend: ");
                Book ran = favB(lib, user1);;
                user1.updateTempList(ran);
                System.out.println(ran.getBookDetails());
            }
            else if(in.equalsIgnoreCase("favourite genre")){
                System.out.println("Based on your favourite genre I would recommend: ");
                Book ran = favG(lib, user1);;
                user1.updateTempList(ran);
                System.out.println(ran.getBookDetails());
            }
            else if(in.equalsIgnoreCase("title")){
                System.out.println("Search by title: ");
                Book ran = byTitle(lib, user1, sc.nextLine());
                user1.updateTempList(ran);
                System.out.println("Book(s) that are similar: ");
                System.out.println(ran.getBookDetails());
            }
            else if(in.equalsIgnoreCase("pages")){
                System.out.println("Search by pages: ");
                Book ran = byPages(lib, user1, sc.nextLine());
                user1.updateTempList(ran);
                System.out.println("Book(s) I would recommend: ");
                System.out.println(ran.getBookDetails());
            }
            else if(in.equalsIgnoreCase("author")){
                System.out.println("Search by author: ");
                Book ran = byAuthor(lib, user1, sc.nextLine());
                user1.updateTempList(ran);
                System.out.println("Wow, he made his own language for his books!"); //Add statements like these to statement list, print when related author/book is printed.
                System.out.println(ran.getBookDetails());
            }
            /*
            else if(in.equalsIgnoreCase("gettemplist")){
                System.out.println(user1.getTempList().toString());
            }
            else if(in.equalsIgnoreCase("getpermlist")){
                System.out.println(user1.getPermList().toString());
            }
            */
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






    }



}
