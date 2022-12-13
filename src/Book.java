import java.time.LocalDate;

public class Book {

    // PRIVATE FIELDS
    private String name, author, genre, publisher;
    private int year, page;

    // CONSTRUCTOR
    public Book(String name, String author, String genre, String publisher, int year, int page) {
        setName(name);
        setAuthor(author);
        setGenre(genre);
        setPublisher(publisher);
        setYear(year);
        setPage(page);
    }

    // GETTER AND SETTER FOR NAME (cannot be empty)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name.isEmpty()){
            System.err.println("Name cannot be empty");
            return;
        }
        this.name = name;
    }

    // GETTER AND SETTER FOR AUTHOR (cannot be empty)
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        if(author.isEmpty()){
            System.err.println("Author cannot be empty");
            return;
        }
        this.author = author;
    }

    // GETTER AND SETTER FOR GENRE (cannot be empty)
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        if(genre.isEmpty()){
            System.err.println("Genre cannot be empty");
            return;
        }
        this.genre = genre;
    }

    // GETTER AND SETTER FOR PUBLISHER (cannot be empty)
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        if(publisher.isEmpty()){
            System.err.println("Publisher cannot be empty");
            return;
        }
        this.publisher = publisher;
    }

    // GETTER AND SETTER FOR YEAR (cannot be minus zero or more than current year)
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if(year < 0 || year > LocalDate.now().getYear()){
            System.err.println("Year cannot be negative or future year");
            return;
        }
        this.year = year;
    }

    // GETTER AND SETTER FOR PAGE (cannot be zero or minus)
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        if(page <= 0){
            System.err.println("Page cannot be zero or less");
            return;
        }
        this.page = page;
    }

    // toString method including all fields (modified)
    public String toString() {
        return "Name: " + name + " | Author: " + author + " | Genre: " + genre +
                "\n | Publisher: " + publisher + " | Year: " + year + " | Page: " + page;
    }

}
