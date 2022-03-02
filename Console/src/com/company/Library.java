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
            bookList.add(new Book("monty python", "comedy", "person"));

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

    public ArrayList<Book> getGeneraList(String genera) {
        ArrayList<Book> generaList = new ArrayList<>();
        bookList = getBookList();
        for (Book b:bookList) {
            if(b.getGenre() == genera) {
                //System.out.println("match"+b.getGenre());
                generaList.add(b);
            }

        }
        //System.out.println(generaList);
        return  generaList;
    }
    public ArrayList<Book> getAuthorList(String author) {
        ArrayList<Book> authorList = new ArrayList<>();
        for (Book b:bookList) {
            if(b.getAuthor() == author)
            {
                authorList.add(b);
            }
        }
        return  authorList;
    }
    public ArrayList<String> getAllAuthors() {
        ArrayList<String> authors = new ArrayList<>();
        for (Book book :bookList) {
            authors.add(book.getAuthor());
        }
        return authors;
    }

    public ArrayList<String> getTitleList(ArrayList<Book> books) {
        ArrayList<String> titles = new ArrayList<>();
        for (Book book :books) {
            titles.add(book.getAuthor());
        }
        return titles;
    }
    public Book getGeneraRand(String genera) {
        ArrayList<Book> generaList = getGeneraList(genera);
        int randNum = (int)(Math.random() * generaList.size());
        Book rand = new Book();
        if (generaList.size()>0) {
            rand = generaList.get(randNum);
        }
        return rand;
    }
    public Book getAuthRand(String author) {
        ArrayList<Book> authorList = getAuthorList(author);
        int randNum = (int) (Math.random() * authorList.size());
        Book rand = new Book();
        if (authorList.size() > 0) {
            rand = authorList.get(randNum);
        }
        return rand;
    }
    public Book getTitleRandom() {
        int randNum = (int)(Math.random() * bookList.size());
        Book rand = bookList.get(randNum);
        return rand;
    }
    public Book getTitleRandom(ArrayList<Book> books) {
        int randNum = (int)(Math.random() * books.size());
        Book rand = books.get(randNum);
        return rand;
    }


}



