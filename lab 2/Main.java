public class Main {
    public static void main(String[] args) {
        Author author = new Author("Pedro");
        Book book = new Book("Odisea", author, 30.99);
        book.getInfo();
    }
}