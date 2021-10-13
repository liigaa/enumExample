import java.util.ArrayList;

public class BookService {
    private ArrayList<Book> books;


    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Book> fantasyList() {
        ArrayList<Book> fantasyBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equals(Genre.FANTASY)) {
                fantasyBooks.add(book);
            }
        }
        return fantasyBooks;
    }

    public ArrayList<Book> findBefore1999() {
        ArrayList<Book> before1999Books = new ArrayList<>();
        for (Book book : books) {
            if (book.getYearOfRelease() < 1999) {
                before1999Books.add(book);
            }
        }
        return before1999Books;
    }

    public ArrayList<Book> listOfAuthorBook(Author provideAuthor) {
        ArrayList<Book> authorBooks = new ArrayList<>();
        for (Book book : books) {
            for (Author author : book.getAuthors()) {
                if (provideAuthor.equals(author)) {
                    authorBooks.add(book);
                }
            }
        }
        return authorBooks;
    }

    public Book mostExpensive() {
        //Variable that stores the book thats most expensive and set the initial value to the first book in the array.
        Book mostExpensive = books.get(0);

        for (Book book : books) {
            if (book.getPrice() > mostExpensive().getPrice()) {
                mostExpensive = book;
            }
        }
        return mostExpensive;
    }

    public Book mostCheapest() {
        Book mostCheapest = books.get(0);
        for (Book book : books) {
            if(book.getPrice()< mostCheapest.getPrice()){
                mostCheapest = book;
            }
        }return mostCheapest;
    }


//verifying a book is on the list
    public Boolean verifyBook(Book book){
        //books.contains() is a method in the ArrayList that returns true if the item is present in the array list
        return books.contains(book);
    }

public Book with3Author(){
        for(Book book: books){
            if(book.getAuthors().size() == 3){
                return book;
            }
        }return null;
}
}

