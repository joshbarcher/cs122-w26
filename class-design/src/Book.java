public class Book {
    //visibility modifiers - public, private, package, protected
    private String title;
    private String author;
    private int pages;
    private boolean hasCover;

    //this is a constructor!
    public Book(String bookAuthor, int bookPages,
                boolean cover, String bookTitle) {
        title = bookTitle;
        author = bookAuthor;
        pages = bookPages;
        hasCover = cover;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
