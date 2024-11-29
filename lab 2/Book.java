public class Book {
    private String tittle;
    private Author author;
    private double price;
    
    public Book(String title, Author author, double price)
    {
        this.tittle = title;
        this.author = author;
        this.price = price; 
    }
    public void getInfo()
    {
        System.out.println(this.tittle);
        System.out.println(this.author.getName());
        System.out.println(this.price);
        
    }
    public String getTitle()
    {
        return this.tittle;
    }
    public void setTitle(String tittle)
    {
        this.tittle = tittle;
    }
    public Author getAuthor()
    {
        return this.author;
    }
    public void setAuthor(Author author)
    {
        this.author = author;
    }
    public Double getprice()
    {
        return this.price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
}
