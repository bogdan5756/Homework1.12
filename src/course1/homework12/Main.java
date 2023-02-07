package course1.homework12;

public class Main {
    public static void main(String[] args) {

        Author author = new Author("Lev", "Tolstoy");
        Author author1 = new Author("Lev", "Tolstoy");
        Book book = new Book("War and Peace", author, 1867);
        System.out.println("author equals itself = " + author.equals(author));
        System.out.println("author equals author1 = " + author.equals(author1));
        System.out.println("author equals string = " + author.equals("a"));
        System.out.println("author hash code = " + author.hashCode());

        System.out.println(author);

        System.out.println(book);

        book.setPublishingYear(1900);

        System.out.println(book);
    }
}
