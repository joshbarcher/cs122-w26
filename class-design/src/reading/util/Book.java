package reading.util;

public class Book {
    //visibility modifiers - public, private, package, protected
    private String title;
    private String author;
    private int pages;
    private boolean hasCover;

    //this is a default constructor
    public Book() {
        title = "Diary Of The Wimpy Kid";
        author = "Jeff Kinney";
        pages = 700;
        hasCover = true;
    }

    //this is a constructor!
    public Book(String author, int pages,
                boolean hasCover, String title) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.hasCover = hasCover;
    }

    //getters (aka accessors)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    //setters (aka mutators)
    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            return;
        }

        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        String bookStr = "---------------------";

        bookStr += "\nTitle: " + title;
        bookStr += "\nAuthor: " + author;
        bookStr += "\nPages: " + pages;
        bookStr += "\nCover: " + hasCover;
        bookStr += "\n---------------------\n";

        return bookStr;
    }
}
