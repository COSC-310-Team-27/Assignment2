package com.company;

public class Book {
    private String title, genre, author;

    public Book(String title, String genre, String pages, String author) {
        this.title = title;
        this.genre = genre;
        this.author = author;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        if(genre == "Sci-Fi")
         return " Genre     title    author\n" +
                "-------------------------\n " +
                 genre+"  "+title+" "+author;
        return null;
    }
}

