package com.company.booklib;

import java.util.*;


public class BookLibrary {

    private List<Book> booksList = new ArrayList<>();

    @Override
    public String toString() {
        return "BookLibrary{" +
                "booksList=" + booksList +
                '}';
    }
    public static void main(String[] args) {
        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.addBooks();
        Scanner sc = new Scanner(System.in);
        System.out.println("For genre Press 1 and for Author Name press 2");
        int type = sc.nextInt();
        Scanner takeAuthorName = new Scanner(System.in);
        if(type == 1){
            System.out.println("Available Genre is\n    1) comic\n" + "    2) action\n" + "    3) thriller");
            System.out.println("Give a genre Name  \n");
            String strForGenre = sc.next();
            Genre genre = Genre.valueOf(strForGenre.toLowerCase());
            bookLibrary.giveGenre(genre,bookLibrary.booksList);
        } else if (type == 2) {
            System.out.println("Available writer is \n 1) Kazi Nozrul Islam \n 2) Rabindranath Tagore ");
            String strForAuthor = takeAuthorName.nextLine();
            bookLibrary.giveAuthorName(strForAuthor.toLowerCase(),bookLibrary.booksList);
        }
        else System.out.println("Press wrong number");

    }

    public void addBooks() {
        Author kaziNozrul = new Author();
        kaziNozrul.setName("kazi nozrul islam");
        kaziNozrul.setAge(51);
        kaziNozrul.setCountry("India");

        Book mirtuKhuda = new Book();
        mirtuKhuda.setName("Mirtukhuda");
        mirtuKhuda.setCountry("India");
        mirtuKhuda.setAuthor(kaziNozrul);
        mirtuKhuda.setGenre(Genre.thriller);
        booksList.add(mirtuKhuda);
        // For inheritance

        Book badhonHara = new Book("Badhon Hara","India",kaziNozrul,Genre.comic);
        booksList.add(badhonHara);
        Book shuliMala = new Book("ShuliMala","India",kaziNozrul,Genre.thriller);
        booksList.add(shuliMala);
        Book kuhelika = new Book("Kuhelika","India",kaziNozrul,Genre.action);
        booksList.add(kuhelika);

        Book gitanJali = new Book ("Gitan Jali","India",new Author("rabindranath tagore",58,"India"),Genre.comic);
        booksList.add(gitanJali);

        Author robiThakur = new Author();
        robiThakur.setName("rabindranath tagore");
        robiThakur.setAge(58);
        robiThakur.setCountry("India");

        Book kabuliWala = new Book();
        kabuliWala.setName("KabuliWala");
        kabuliWala.setCountry("India");
        kabuliWala.setAuthor(robiThakur);
        kabuliWala.setGenre(Genre.comic);
        booksList.add(kabuliWala);

        Book theHomeAndTheWorld = new Book("The Home and the World", "India",robiThakur,Genre.thriller);
        booksList.add(theHomeAndTheWorld);

    }

    public void giveGenre(Genre genre, List<Book> booksList){
        int bookNum = 0;
        for( Book i: booksList){
            if (i.getGenre() == genre){
                bookNum++;
                System.out.printf("%d) Book name = %s\tAuthor Name = %s",bookNum,i.getName(),i.getAuthorName());
                System.out.println("\n-------------------------------");
            }
        }

//        switch (genre){
//            case comic -> {
//                for( Book i: booksList)
//                    switch (i.getGenre()){
//                        case comic ->
//                            System.out.println("Book name = "+i.getName()+"Author Name"+i.getAuthor());
//                }
//            }
//            case action -> System.out.println("Action Book");
//            case thriller -> System.out.println("Thriller");
//        }
    }
    public void giveAuthorName(String authorName, List<Book> booksList){
        int bookNumber = 0;
        for(Book i : booksList){
            if(Objects.equals(i.getAuthorName(),authorName)){
                bookNumber ++;
                System.out.printf("%d) Book name\t= %s\tGenre Name = %s",bookNumber,i.getName(),i.getGenre());
                System.out.println("\n-------------------------------");
            }
        }
    }
}
