package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
        private ArrayList<Book> bookList = new ArrayList<>();
        public Library() {
            bookList.add(new Book("Dune", "Sci-Fi", "F. Hebert"));
            bookList.add(new Book("Foundation", "Sci-Fi",  "I. Asimov"));
            bookList.add(new Book("Lord of the Rings", "Fantasy",  "J.R. Tolkien"));
            bookList.add(new Book("Game of Thrones", "Fantasy",  "G.R.R. Martin"));
            bookList.add(new Book("Odyssey", "classic",  "Homer"));
            bookList.add(new Book("The Great Gatsby", "classic",  "F. Scott Fitzgerald"));
            bookList.add(new Book("Overlord, Vol 1 - The Undead King", "Light novel",  "Kugane Maruyama"));
            bookList.add(new Book("Overlord, Vol 2 - The Dark Warrior", "Light novel",  "Kugane Maruyama"));
            bookList.add(new Book("Overlord, Vol 3 - The Bloody Valkyrie", "Light novel", "Kugane Maruyama"));
            bookList.add(new Book("Overlord, Vol 4 - The Lizardman Heroes", "Light novel",  "Kugane Maruyama"));
            bookList.add(new Book("Overlord, Vol 5 - The Men Of The Kingdome Part 1", "Light novel","Kugane Maruyama"));
            bookList.add(new Book("Overlord, Vol 6 - The Men Of The Kingdome Part 2", "Light novel", "Kugane Maruyama"));

    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }
    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
    public boolean addBook(String title, String genre, String pages, String author) {
        bookList.add(new Book(title,genre,author));
        return true;
    }

    public ArrayList<Book> getGeneras(String genera) {
        ArrayList<Book> generaList = new ArrayList<>();
        for (Book b:bookList) {
            if(b.getGenre().equalsIgnoreCase(genera));
                generaList.add(b);
        }
        return  generaList;
    }
}

//TODO getBook()
//  getName(s)()
// getAuthors(s)()

