package reading;

/*
    Extends means we want to borrow from a
    parent class.
 */
public class EBook extends Book {
    private String format;

    public EBook() {
        this.format = "azw3";
    }

    public EBook(String format, String author, int pages, boolean hasCover, String title) {
        //this is calling the parent constructor
        super(author, pages, hasCover, title);

        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void readOnFavoriteReader() {
        System.out.println("Reading on my paper white kindle");
    }
}
