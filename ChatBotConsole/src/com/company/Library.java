package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {



        private Book a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p;
        private ArrayList<Book> bookList = new ArrayList<>(Arrays.asList(a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p));
        public Library() {
            a = new Book("Dune", "Sci-Fi", "300", "F. Hebert");
            b = new Book("Foundation", "Sci-Fi", "300", "I. Asimov");
            c = new Book("Lord of the Rings", "Fantasy", "300", "J.R. Tolkien");
            d = new Book("Game of Thrones", "Fantasy", "300", "G.R.R. Martin");
            e = new Book("Odyssey", "classic", "300", "Homer");
            f = new Book("The Great Gatsby", "classic", "300", "F. Scott Fitzgerald");
            g = new Book("Dune", "Sci-Fi", "300", "F. Hebert");
            h = new Book("Dune", "Sci-Fi", "300", "F. Hebert");
            i = new Book("Dune", "Sci-Fi", "300", "F. Hebert");
            j = new Book("Dune", "Sci-Fi", "300", "F. Hebert");
            k = new Book("Dune", "Sci-Fi", "300", "F. Hebert");
            l = new Book("Dune", "Sci-Fi", "300", "F. Hebert");
            m = new Book("Dune", "Sci-Fi", "300", "F. Hebert");
            n = new Book("Dune", "Sci-Fi", "300", "F. Hebert");
            o = new Book("Dune", "Sci-Fi", "300", "F. Hebert");
            p = new Book("Dune", "Sci-Fi", "300", "F. Hebert");

    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
    public boolean addBook(String title, String genre, String pages, String author) {
        bookList.add(new Book(title,genre,pages,author));
        return true;
    }
}
