package test;

import reading.AudioBook;
import reading.Book;
import reading.CollectorsItem;
import reading.EBook;

public class TestProgram {
    public static void main(String[] args) {
        EBook ebook = new EBook("epub", "Pierce Brown", 500, true, "Red Rising");
        //CollectorsItem collectorsItem = new CollectorsItem();

        AudioBook aBook = new AudioBook(10, "Stephen Frye", "epub", "JK Rowling",
                400, true, "Harry Potter and the Philosopher's Stone");
        System.out.println(aBook.getNarrator());
        System.out.println(aBook.getFormat());
        System.out.println(aBook.getAuthor());
        System.out.println(aBook.getTitle());
    }

    private static void testBooks() {
        //author, title, cover, pages, ink, format, genre

        //create an instance of a class (aka Object)
        Book lotr = new Book("JRR Tolkien", 1200, true, "The Lord of the Rings");
        System.out.println(lotr);

        System.out.println(lotr.getAuthor() + " wrote " + lotr.getTitle());

        //instantiate more objects based on the Book class
        Book unknownBook = new Book();
        System.out.println(unknownBook.toString());

        Book hungerGames = new Book();
        hungerGames.setTitle("The Hunger Games");
        hungerGames.setAuthor("Suzanne Collins");
        System.out.println(hungerGames.toString());

        Book anotherBook = unknownBook;
        System.out.println(anotherBook);
    }
}
