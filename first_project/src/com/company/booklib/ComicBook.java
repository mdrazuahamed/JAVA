package com.company.booklib;

import com.company.BookLibraryExtended.AuthorExtd;
import com.company.BookLibraryExtended.BookExtd;

public class ComicBook extends BookExtd {
    private int discount;
    public ComicBook() {
    }

    public ComicBook(int discount) {
        this.discount = discount;
    }

    public ComicBook(String name, String country, AuthorExtd author, int price, int discount) {
        super(name, country, author, price);
        this.discount = discount;
    }

    public ComicBook(BookExtd book, int discount) {
        super(book);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
