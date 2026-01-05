public class TestProgram {
    public static void main(String[] args) {
        //author, title, cover, pages, ink, format, genre

        //create an instance of a class (aka Object)
        Book lotr = new Book("JRR Tolkien", 1200,
                true, "The Lord of the Rings");

        //assign fields in object
        /*lotr.author = "JRR Tolkien";
        lotr.pages = 1200;
        lotr.hasCover = true;
        lotr.title = "The Lord of the Rings";*/

        //get the fields in the object
        System.out.println(lotr.getAuthor() + " wrote " +
                lotr.getTitle());
    }
}
