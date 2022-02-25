package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {



        //private Book a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p;
        //private ArrayList<Book> bookList = new ArrayList<>(Arrays.asList(a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p));
        private ArrayList<Book> bookList = new ArrayList<>();
        public Library() {
            bookList.add(new Book("Dune", "Sci-Fi", "300", "F. Hebert"));
            bookList.add(new Book("Foundation", "Sci-Fi", "300", "I. Asimov"));
            bookList.add(new Book("Lord of the Rings", "Fantasy", "300", "J.R. Tolkien"));
            bookList.add(new Book("Game of Thrones", "Fantasy", "300", "G.R.R. Martin"));
            bookList.add(new Book("Odyssey", "classic", "300", "Homer"));
            bookList.add(new Book("The Great Gatsby", "classic", "300", "F. Scott Fitzgerald"));
            bookList.add(new Book("Overlord, Vol 1 - The Undead King", "Light novel", "256", "Kugane Maruyama"));
            bookList.add(new Book("Overlord, Vol 2 - The Dark Warrior", "Light novel", "256", "Kugane Maruyama"));
            bookList.add(new Book("Overlord, Vol 3 - The Bloody Valkyrie", "Light novel", "288", "Kugane Maruyama"));
            bookList.add(new Book("Overlord, Vol 4 - The Lizardman Heroes", "Light novel", "304", "Kugane Maruyama"));
            bookList.add(new Book("Overlord, Vol 5 - The Men Of The Kingdome Part 1", "Light novel", "272", "Kugane Maruyama"));
            bookList.add(new Book("Overlord, Vol 6 - The Men Of The Kingdome Part 2", "Light novel", "292", "Kugane Maruyama"));

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
