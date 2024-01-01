package com.company.booklib;

import com.company.BookLibraryExtended.AuthorExtd;
import com.company.BookLibraryExtended.BookExtd;

public class ActionBook extends BookExtd {
    private int discount;

    public ActionBook(int discount) {
        this.discount = discount;
    }

    public ActionBook(String name, String country, AuthorExtd author, int price, int discount) {
        super(name, country, author, price);
        this.discount = discount;
    }

    public ActionBook(BookExtd book, int discount) {
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
