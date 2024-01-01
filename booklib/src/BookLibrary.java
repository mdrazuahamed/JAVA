import java.util.List;


public class BookLibrary {

    public List<Book> thrillerBooks = List.of();

    public static void main(String[] args) {
        BookLibrary bookLibrary = new BookLibrary();

        bookLibrary.giveGenre(Genre.comic);

    }

    public void bookFactory() {
        Author kaziNozrul = new Author();
        kaziNozrul.name = "Kazi Nozrul Islam";
        kaziNozrul.age = 51;
        kaziNozrul.country = "India";

        Book mirttuKhuda = new Book();
        mirttuKhuda.setName("Mirttu Khuda");
        mirttuKhuda.setCountry("India");
        mirttuKhuda.setAuthor(kaziNozrul);
        mirttuKhuda.setGenre(Genre.thriller);

        thrillerBooks.add(mirttuKhuda);
    }

    public void giveGenre(Genre genre){
        switch (genre){
            case comic -> System.out.println("Comic Book");
            case action -> System.out.println("Action Book");
            case thriller -> System.out.println("Thriller");
        }
    }
}
