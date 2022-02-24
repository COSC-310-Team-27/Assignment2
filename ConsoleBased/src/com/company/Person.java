package com.company;

public class Person {
    private String name;
    private String age;
    private String occupation;
    private String favoriteBook;
    private String favoriteGenera;
    private String query;

    @Override
    public String toString() {
        return super.toString();
    }


    public Person(String name, String age, String occupation, String favoriteBook, String favoriteGenera) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.favoriteBook = favoriteBook;
        this.favoriteGenera = favoriteGenera;
    }
    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getFavoriteBook() {
        return favoriteBook;
    }

    public void setFavoriteBook(String favoriteBook) {
        this.favoriteBook = favoriteBook;
    }

    public String getFavoriteGenera() {
        return favoriteGenera;
    }

    public void setFavoriteGenera(String favoriteGenera) {
        this.favoriteGenera = favoriteGenera;
    }

}
