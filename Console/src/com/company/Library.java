package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
        private ArrayList<Book> bookList = new ArrayList<>();
        public Library() {
            bookList.add(new Book("Dune", "Sci-Fi", 300, "F. Hebert"));
            bookList.add(new Book("Foundation", "Sci-Fi", 300, "I. Asimov"));
            bookList.add(new Book("Lord of the Rings", "Fantasy", 300, "J.R. Tolkien"));
            bookList.add(new Book("Game of Thrones", "Fantasy", 300, "G.R.R. Martin"));
            bookList.add(new Book("Odyssey", "Classic", 300, "Homer"));
            bookList.add(new Book("The Great Gatsby", "Classic", 300, "F. Scott Fitzgerald"));
            bookList.add(new Book("The Love Hypothesis", "Romance", 384, "Ali Hazelwood"));
            bookList.add(new Book("The Fault in Our Stars", "Romance", 313, "John Green"));
            bookList.add(new Book("Sierra Six", "Action", 8, "Mark Greaney"));
            bookList.add(new Book("House of Earth and Blood", "Action", 816, "Sarah J. Maas"));
            bookList.add(new Book("Born a Crime", "Comedy", 304, "Trevor Noah"));
            bookList.add(new Book("Yearbook", "Comedy", 272, "Seth Rogen"));
            bookList.add(new Book("The Minimalist Teacher", "Education", 144, "C. Y. Arnold & Tamera Musiowsky-Borneman"));
            bookList.add(new Book("Ensouling Our Schools: A Universally Designed Framework for Mental Health, Well-Being, and Reconciliation", "Education", 300, "Jennifer Katz & Kevin Lamoureux"));
            bookList.add(new Book("House of Leaves", "Horror", 709, "Mark Z. Danielewski"));
            bookList.add(new Book("Dracula", "Horror", 418, "Bram Stoker"));
            bookList.add(new Book("Overlord, Vol 1 - The Undead King", "Light novel", 256, "Kugane Maruyama"));
            bookList.add(new Book("Overlord, Vol 2 - The Dark Warrior", "Light novel", 256, "Kugane Maruyama"));
            bookList.add(new Book("Overlord, Vol 3 - The Bloody Valkyrie", "Light novel", 288, "Kugane Maruyama"));
            bookList.add(new Book("Overlord, Vol 4 - The Lizardman Heroes", "Light novel", 304, "Kugane Maruyama"));
            bookList.add(new Book("Overlord, Vol 5 - The Men Of The Kingdome Part 1", "Light novel", 272, "Kugane Maruyama"));
            bookList.add(new Book("Overlord, Vol 6 - The Men Of The Kingdome Part 2", "Light novel", 292, "Kugane Maruyama"));
            bookList.add(new Book("Overlord, Vol 7 - The Invaders Of The Great Tomb", "Light novel", 350, "Kugane Maruyama"));
            bookList.add(new Book("Overlord, Vol 8 - The Two Leaders", "Light novel", 288, "Kugane Maruyama"));
            bookList.add(new Book("The return of Johnny Ridden MSV-R, Vol 1", "Manga", 350, "Kugane Maruyama"));
            bookList.add(new Book("Gundam Thunderbolt, Vol 1", "Manga", 350, "Hajime Yadate"));
            bookList.add(new Book("Gundam Thunderbolt, Vol 2", "Manga", 350, "Hajime Yadate"));
            bookList.add(new Book("Gundam Thunderbolt, Vol 3", "Manga", 350, "Hajime Yadate"));
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


    public boolean addBook(String title, String genre, int pages, String author) {
        bookList.add(new Book(title,genre,pages,author));
        return true;
    }
    //To string exists.
    //To string sucks so I'm using this
    public String getBookDetails(int i){
        return "Title: " + bookList.get(i).getTitle() + "\t\tGenre: " + bookList.get(i).getGenre() + "\t\tAuthor: " + bookList.get(i).getAuthor();
    }
    public String listString(ArrayList<Book> books)  {
            String bookString = "";
        for (Book b:books) {
            bookString += b.getTitle() + " \n";
        }
        return bookString;
    }

}



