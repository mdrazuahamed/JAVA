package org.example;

public class ThrillerBook extends Book {
    private int discount=5;

    public ThrillerBook(){

    }
//    public ThrillerBookExtd(String name, String country, AuthorExtd author, int price) {
//        super(name, country, author, price);
//    }


    public ThrillerBook(String name, String country, Author author, int price, String genre) {
        super(name, country, author, price, genre);
    }

    public ThrillerBook(Book book){
        //super(book.getName(), book.getCountry(), book.getAuthor(),book.getGenre());
        super(book);
    }
    public String getAuthorNameExtd(){
        return super.getAuthorName();
    }

    public int getDiscount() {

        System.out.println("In Thriller book class");
        return discount;
    }
//
//    public void setDiscount(int discount) {
//        this.discount = discount;
//    }
}
