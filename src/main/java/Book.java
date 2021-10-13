import java.util.ArrayList;

public class Book {
    private String title;
    private int price;
    private int yearOfRelease;
    private ArrayList<Author> authors;
    private Genre genre;

    Book(String title, int yearOfRelease, int price, Genre genre){
        this.title = title;
        this.yearOfRelease = yearOfRelease;
        this.price = price;
        this.genre = genre;
        this.authors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public ArrayList<Author> getAuthors(){
        return authors;
    }

    public String toString(){
        return "______Book " + getTitle() + " ________" + "\n Book Price " + getPrice() + " EUR";
    }
}
