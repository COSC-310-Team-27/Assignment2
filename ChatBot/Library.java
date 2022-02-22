package com.example.chatbot;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    ArrayList<String> books = new ArrayList<>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));

    private ArrayList<Book> bookList;
    private Book a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p;
    public Library() {
        a = new Book("Dune", "Sci-Fi", "300", "F. Hebert");
        b = new Book("Foundation", "Sci-Fi", "300", "I. Asimov");
        c = new Book("Lord of the Rings", "Fantasy", "300", "J.R. Tolkien");
        d = new Book("Game of Thrones", "Fantasy", "300", "G.R.R. Martin");

        e = new Book("1954", "Dystopia", "328", "George Orwell");
        f = new Book("The Road", "Dystopia", "287", "Cormac McCarthy");
        g = new Book("A Clockwork Orange", "Dystopia", "192", "Anthony Burgess");

        h = new Book("It", "Horror", "1138", "Stephen King");
        i = new Book("Frankenstein", "Horror", "280", "Mary Shelley");
        j = new Book("The Ruins", "Horror", "384", "Scott Smith");

        k = new Book("Harry Potter and the Sorcerer's Stone", "Children's", "223", "J.K. Rowling");
        l = new Book("Harry Potter and the Chamber of Secrets", "Children's", "251", "J.K. Rowling");
        m = new Book("Into the Wild", "Children's", "272", "Erin Hunter");

        n = new Book("Dune", "Sci-Fi", "300", "F. Hebert");
        o= new Book("Dune", "Sci-Fi", "300", "F. Hebert");
        p= new Book("Dune", "Sci-Fi", "300", "F. Hebert");



    }
}
