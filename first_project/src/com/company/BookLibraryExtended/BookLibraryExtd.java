package com.company.BookLibraryExtended;
import java.util.*;
import com.company.booklib.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class BookLibraryExtd {
    private List<ThrillerBookExtd> thrillerBook = new ArrayList<>();
    private List<ComicBookExtd> comicBook = new ArrayList<>();
    private List<ActionBookExtd> actionBook = new ArrayList<>();
    private List<BookExtd> bookExtdList = new ArrayList<>();

    @Override
    public String toString() {
        return "BookLibraryExtd{" +
                "thrillerBook=" + thrillerBook +
                ", comicBook=" + comicBook +
                ", actionBook=" + actionBook +
                '}';
    }

    public static void main(String[] args) {
        com.company.BookLibraryExtended.BookLibraryExtd bookLibrary = new com.company.BookLibraryExtended.BookLibraryExtd();
        bookLibrary.addBooks();
        //System.out.println(bookLibrary.toString());
        System.out.println(bookLibrary.bookExtdList);
        Scanner takeAuthorName = new Scanner(System.in);
        System.out.println("Available writer is \n 1) Kazi Nozrul Islam \n 2) Rabindranath Tagore ");
        String strForAuthor = takeAuthorName.nextLine();
        //bookLibrary.giveAuthorName(strForAuthor.toLowerCase(),bookLibrary.thrillerBook,bookLibrary.comicBook,bookLibrary.actionBook);
        bookLibrary.giveAuthorName(strForAuthor.toLowerCase(), bookLibrary.bookExtdList);

    }

    public void addBooks() {
        AuthorExtd kaziNozrul = new AuthorExtd();
        kaziNozrul.setName("kazi nozrul islam");
        kaziNozrul.setAge(51);
        kaziNozrul.setCountry("India");
        //System.out.println(kaziNozrul.getCountry());

        BookExtd mirtuKhuda = new BookExtd();
        mirtuKhuda.setName("Mirtukhuda");
        mirtuKhuda.setCountry("India");
        mirtuKhuda.setAuthor(kaziNozrul);
        mirtuKhuda.setGenre("Thriller");
        mirtuKhuda.setPrice(500);
        // For inheritance
        //ThrillerBookExtd mirtuKhudaInherite = new ThrillerBookExtd(mirtuKhuda.getName(), mirtuKhuda.getCountry(),kaziNozrul,700,5);
        ThrillerBookExtd mirtuKhudaInherite = new ThrillerBookExtd(mirtuKhuda);
        bookExtdList.add(mirtuKhudaInherite);

        ComicBookExtd badhonHaraInherite = new ComicBookExtd("Badhon hara", "India", kaziNozrul, 600, "Comic");
        bookExtdList.add(badhonHaraInherite);

        BookExtd shulimala = new BookExtd();
        shulimala.setName("Shuli Mala");
        shulimala.setCountry("India");
        shulimala.setAuthor(kaziNozrul);
        shulimala.setPrice(650);
        ThrillerBookExtd shulimalaInheritance = new ThrillerBookExtd(shulimala.getName(), shulimala.getCountry(), shulimala.getAuthor(), shulimala.getPrice(), "Thriller");
        bookExtdList.add(shulimalaInheritance);

        BookExtd kuhelika = new BookExtd("Kuhelika", "India", kaziNozrul, 700, "Action");
        ActionBookExtd kuhelikaInherite = new ActionBookExtd(kuhelika.getName(), kuhelika.getCountry(), kuhelika.getAuthor(), 750, mirtuKhuda.getGenre());
        bookExtdList.add(kuhelikaInherite);

        //comic
        BookExtd gitanJali = new BookExtd("Gitan Jali", "India", new AuthorExtd("rabindranath tagore", 58, "India"), 800, "Comic");
        ComicBookExtd gitanjaliInherite = new ComicBookExtd(gitanJali.getName(), gitanJali.getCountry(), gitanJali.getAuthor(), 850, gitanJali.getGenre());
        bookExtdList.add(gitanjaliInherite);

        AuthorExtd robiThakur = new AuthorExtd("rabindranath tagore", 58, "India");

        BookExtd kabuliWala = new BookExtd();
        kabuliWala.setName("KabuliWala");
        kabuliWala.setCountry("India");
        kabuliWala.setAuthor(robiThakur);
        kabuliWala.setPrice(800);
        kabuliWala.setGenre("Comic");
        ComicBookExtd kabuliWalaInherite = new ComicBookExtd(kabuliWala.getName(), kabuliWala.getCountry(), kabuliWala.getAuthor(), 950, kabuliWala.getGenre());
        bookExtdList.add(kabuliWalaInherite);

        BookExtd theHomeAndTheWorld = new BookExtd("The Home and the World", "India", robiThakur, 1000, "Thriller");
        ThrillerBookExtd theHomeAndTheWorldInherite = new ThrillerBookExtd(theHomeAndTheWorld.getName(), theHomeAndTheWorld.getCountry(), theHomeAndTheWorld.getAuthor(), 950, theHomeAndTheWorld.getGenre());
        bookExtdList.add(theHomeAndTheWorldInherite);

    }

    public void giveAuthorName(String authorName, List<BookExtd> bookExtdList) {
        int bookNumber = 0;
        int price = 0;
        for (BookExtd i : bookExtdList) {
            if (Objects.equals(i.getAuthor(), authorName)) {
                if (Objects.equals(i.getGenre(), "Thriller")) {
                    ThrillerBookExtd thrillerBookExtd = new ThrillerBookExtd();
                    price = i.getPrice() - i.getPrice() * thrillerBookExtd.getDiscount() / 100;
                    System.out.printf("Thriller Book %d) Book name\t= %s\t Price = %d", bookNumber, i.getName(), price);
                    System.out.println("\n-------------------------------");
                }
                if (Objects.equals(i.getGenre(), "Action")) {
                    ActionBookExtd actionBookExtd = new ActionBookExtd();
                    price = i.getPrice() - i.getPrice() * actionBookExtd.getDiscount() / 100;
                    System.out.printf("Action Book %d) Book name\t= %s\t Price = %d", bookNumber, i.getName(), price);
                    System.out.println("\n-------------------------------");
                }
                if (Objects.equals(i.getGenre(), "Comic")) {
                    ComicBookExtd comicBookExtd = new ComicBookExtd();
                    price = i.getPrice() - i.getPrice() * comicBookExtd.getDiscount() / 100;
                    System.out.printf("Comic Book %d) Book name\t= %s\t Price = %d", bookNumber, i.getName(), price);
                    System.out.println("\n-------------------------------");
                }
            }
//        for(ThrillerBookExtd i : thrillerBook){
//            //System.out.println(i.getAuthorNameExtd());
//            if(Objects.equals(i.getAuthorNameExtd(),authorName)){
//                bookNumber ++;
//                price = i.getPrice()-i.getPrice()*i.getDiscount()/100;
//                System.out.printf("Thriller Book %d) Book name\t= %s\t Price = %d",bookNumber,i.getName(),price);
//                System.out.println("\n-------------------------------");
//            }
//        }
//        for(ComicBookExtd i : comicBook){
//            //System.out.println(i.getAuthorNameExtd());
//            if(Objects.equals(i.getAuthorNameExtd(),authorName)){
//                bookNumber ++;
//                price = i.getPrice()-i.getPrice()*i.getDiscount()/100;
//                System.out.printf("Comic Book %d) Book name\t= %s\t Price = %d",bookNumber,i.getName(),price);
//                System.out.println("\n-------------------------------");
//            }
//        }
//        for(ActionBookExtd i : actionBook){
//            //System.out.println(i.getAuthorNameExtd());
//            if(Objects.equals(i.getAuthorNameExtd(),authorName)){
//                bookNumber ++;
//                price = i.getPrice()-i.getPrice()*i.getDiscount()/100;
//                System.out.printf("Action Book +%d) Book name\t= %s\t Price = %d",bookNumber,i.getName(),price);
//                System.out.println("\n-------------------------------");
//            }
//        }
        }
    }
}

