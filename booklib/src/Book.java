public class Book {

    private String name;
    private String country;
    private Author author;
    private Genre genre;

    public Book() {}

    public Book(String name, String country, Author author, Genre genre) {
        this.name = name;
        this.country = country;
        this.author = author;
        this.genre = genre;
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
