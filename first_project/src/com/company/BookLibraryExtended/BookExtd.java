package com.company.BookLibraryExtended;

public class BookExtd {
    private String name;
    private String country;
    private AuthorExtd author;
    private int price;
    private String genre;
    public BookExtd(){

    }

//    public BookExtd(String name, String country, AuthorExtd author, int price) {
//        this.name = name;
//        this.country = country;
//        this.author = author;
//        this.price = price;
//    }

    public BookExtd(String name, String country, AuthorExtd author, int price, String genre) {
        this.name = name;
        this.country = country;
        this.author = author;
        this.price = price;
        this.genre = genre;
    }

    public BookExtd(BookExtd book) {
        name = book.name;
        country = book.country ;
        author = book.author ;
        price = book.price ;
        System.out.println(book.getCountry());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public AuthorExtd getAuthor() {
        return author;
    }

    public void setAuthor(AuthorExtd author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }
    public String getAuthorName(){
        return author.getName();
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "BookExtd{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                '}';
    }
}
