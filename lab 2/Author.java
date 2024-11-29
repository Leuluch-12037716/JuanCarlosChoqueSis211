import java.util.ArrayList;

public class Author {
    private String name;
    ArrayList<Book> books;
    public Author(String name)
    {
        this.name = name;
        this.books = new ArrayList<Book>();
    }
    public void addBook (Book book)
    {
        books.add(book);
    }
    public ArrayList<Book> getBooks()
    {
        return this.books;
    }
    
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void addBook (String tittle, Double price)
    {
        Book book = new Book(tittle, this, price);
        books.add(book);
    }
}