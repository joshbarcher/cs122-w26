package test;

import reading.util.Book;

public class TestProgram {
    public static void main(String[] args) {
        //author, title, cover, pages, ink, format, genre

        //create an instance of a class (aka Object)
        Book lotr = new Book("JRR Tolkien", 1200,
                true, "The Lord of the Rings");

        System.out.println(lotr.getAuthor() + " wrote " +
                lotr.getTitle());

        //instantiate more objects based on the Book class
        Book unknownBook = new Book();
        System.out.println(unknownBook);

        Book unknownBook2 = new Book();
        System.out.println(unknownBook2);

        Book anotherBook = unknownBook;
        System.out.println(anotherBook);
    }
}
