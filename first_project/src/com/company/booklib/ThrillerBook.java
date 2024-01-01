package com.company.booklib;

import com.company.BookLibraryExtended.AuthorExtd;
import com.company.BookLibraryExtended.BookExtd;

public class ThrillerBook extends BookExtd {
    private int discount;

    public ThrillerBook(){

    }

    public ThrillerBook(String name, String country, AuthorExtd author, int price, int discount) {
        super(name, country, author, price);
        this.discount = discount;
    }

    public ThrillerBook(BookExtd book, int discount){
        //super(book.getName(), book.getCountry(), book.getAuthor(),book.getGenre());
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
