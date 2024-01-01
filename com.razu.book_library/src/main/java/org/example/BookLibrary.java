package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class BookLibrary {
    private List<ThrillerBook> thrillerBook = new ArrayList<>();
    private List<ComicBook> comicBook = new ArrayList<>();
    private List<ActionBook> actionBook = new ArrayList<>();
    private List<Book> bookList = new ArrayList<>();

    @Override
    public String toString() {
        return "BookLibraryExtd{" +
                "thrillerBook=" + thrillerBook +
                ", comicBook=" + comicBook +
                ", actionBook=" + actionBook +
                '}';
    }

    public static void main(String[] args) {
        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.addBooks();
        //System.out.println(bookLibrary.toString());
        System.out.println(bookLibrary.bookList);
        Scanner takeAuthorName = new Scanner(System.in);
        System.out.println("Available writer is \n 1) Kazi Nozrul Islam \n 2) Rabindranath Tagore ");
        String strForAuthor = takeAuthorName.nextLine();
        //bookLibrary.giveAuthorName(strForAuthor.toLowerCase(),bookLibrary.thrillerBook,bookLibrary.comicBook,bookLibrary.actionBook);
        bookLibrary.giveAuthorName(strForAuthor.toLowerCase(), bookLibrary.bookList);

    }

    public void addBooks() {
        Author kaziNozrul = new Author();
        kaziNozrul.setName("kazi nozrul islam");
        kaziNozrul.setAge(51);
        kaziNozrul.setCountry("India");
        //System.out.println(kaziNozrul.getCountry());
//
//        BookExtd mirtuKhuda = new BookExtd();
//        mirtuKhuda.setName("Mirtukhuda");
//        mirtuKhuda.setCountry("India");
//        mirtuKhuda.setAuthor(kaziNozrul);
//        mirtuKhuda.setGenre("Thriller");
//        mirtuKhuda.setPrice(500);
        // For inheritance
        //ThrillerBookExtd mirtuKhudaInherite = new ThrillerBookExtd(mirtuKhuda.getName(), mirtuKhuda.getCountry(),kaziNozrul,700,5);
        ThrillerBook mirtuKhudaInherite = new ThrillerBook("Mirtu Khuda","India",kaziNozrul,500,"Thriller");
        bookList.add(mirtuKhudaInherite);

        ComicBook badhonHaraInherite = new ComicBook("Badhon hara", "India", kaziNozrul, 600, "Comic");
        bookList.add(badhonHaraInherite);

//        BookExtd shulimala = new BookExtd();
//        shulimala.setName("Shuli Mala");
//        shulimala.setCountry("India");
//        shulimala.setAuthor(kaziNozrul);
//        shulimala.setPrice(650);
        ThrillerBook shulimalaInheritance = new ThrillerBook("Shuli Mala", "India",kaziNozrul,650, "Thriller");
        bookList.add(shulimalaInheritance);

        // BookExtd kuhelika = new BookExtd("Kuhelika", "India", kaziNozrul, 700, "Action");
        ActionBook kuhelikaInherite = new ActionBook("Kuhelika", "India",kaziNozrul, 750,"Action");
        bookList.add(kuhelikaInherite);

        //comic
        //BookExtd gitanJali = new BookExtd("Gitan Jali", "India", new AuthorExtd("rabindranath tagore", 58, "India"), 800, "Comic");
        ComicBook gitanjaliInherite = new ComicBook("Gitan Jali",  "India", new Author("rabindranath tagore", 58, "India"), 800, "Comic");
        bookList.add(gitanjaliInherite);

        Author robiThakur = new Author("rabindranath tagore", 58, "India");
//
//        BookExtd kabuliWala = new BookExtd();
//        kabuliWala.setName("KabuliWala");
//        kabuliWala.setCountry("India");
//        kabuliWala.setAuthor(robiThakur);
//        kabuliWala.setPrice(800);
//        kabuliWala.setGenre("Comic");
        ComicBook kabuliWalaInherite = new ComicBook("KabuliWala", "India", robiThakur, 800, "Comic");
        bookList.add(kabuliWalaInherite);

        //BookExtd theHomeAndTheWorld = new BookExtd("The Home and the World", "India", robiThakur, 1000, "Thriller");
        //ThrillerBookExtd theHomeAndTheWorldInherite = new ThrillerBookExtd(theHomeAndTheWorld.getName(), theHomeAndTheWorld.getCountry(), theHomeAndTheWorld.getAuthor(), 950, theHomeAndTheWorld.getGenre());
        ThrillerBook theHomeAndTheWorldInherite = new ThrillerBook("The Home and the World", "India", robiThakur, 1000, "Thriller");
        bookList.add(theHomeAndTheWorldInherite);

        Fiction fiction = new Fiction("Ami Tomake Chai", "India", robiThakur, 1000, "Thriller");
        bookList.add(fiction);

    }

    public void giveAuthorName(String authorName, List<Book> bookList) {
        int bookNumber = 0;
        int actionBookNumber = 0;
        int comicBookNumber = 0;
        int price = 0;
        double finalPrice;
        for (Book i : bookList) {
            if (Objects.equals(i.getAuthorName(), authorName)) {
                bookNumber++;
                price = i.getPrice();
                int discount = i.getDiscount();
                finalPrice = price - price * discount / 100;
                System.out.printf(" %d) Book name\t= %s\t Price = %.2f", bookNumber, i.getName(), finalPrice);
                System.out.println("\n-------------------------------");
            }
            //System.out.println(i);
            //System.out.println(i.getAuthorName());
//            if (Objects.equals(i.getAuthorName(), authorName)) {
//                bookNumber++;
//                if (Objects.equals(i.getGenre(), "Thriller")) {
//                    ThrillerBookExtd thrillerBookExtd = new ThrillerBookExtd();
//                    price = i.getPrice() - i.getPrice() * thrillerBookExtd.getDiscount() / 100;
//                    System.out.printf("Thriller Book %d) Book name\t= %s\t Price = %d", bookNumber, i.getName(), price);
//                    System.out.println("\n-------------------------------");
//                }
//                if (Objects.equals(i.getGenre(), "Action")) {
//                    ActionBookExtd actionBookExtd = new ActionBookExtd();
//                    price = i.getPrice() - i.getPrice() * actionBookExtd.getDiscount() / 100;
//                    System.out.printf("Action Book %d) Book name\t= %s\t Price = %d", bookNumber, i.getName(), price);
//                    System.out.println("\n-------------------------------");
//                }
//                if (Objects.equals(i.getGenre(), "Comic")) {
//                    ComicBookExtd comicBookExtd = new ComicBookExtd();
//                    price = i.getPrice() - i.getPrice() * comicBookExtd.getDiscount() / 100;
//                    System.out.printf("Comic Book %d) Book name\t= %s\t Price = %d", bookNumber, i.getName(), price);
//                    System.out.println("\n-------------------------------");
//                }
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


