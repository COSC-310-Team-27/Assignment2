package com.company;

public class Book {
    private String title, genre, author, pages;
    private Library lib;

    public Book(){

    }

    public Book(String title){
        for (int i = 0; i < lib.getBookList().size(); i++) {
            if(title.equalsIgnoreCase(lib.getBookList().get(i).title)){
                this.title = lib.getBookList().get(i).title;
                genre = lib.getBookList().get(i).genre;
                author = lib.getBookList().get(i).author;
            }
        }
    }

    public Book(String title, String genre,  String author, String pages) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.pages = pages;
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
}
