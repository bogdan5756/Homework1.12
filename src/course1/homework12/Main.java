package course1.homework12;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Lev", "Tolstoy");
        Book book = new Book("War and Peace", author, 1867);
        System.out.printf(
                "%s by %s %s, %d%n",
                book.getTitle(),
                book.getAuthor().getFirstName(),
                book.getAuthor().getLastName(),
                book.getPublishingYear());
        book.setPublishingYear(1900);
        System.out.printf(
                "%s by %s %s, %d%n",
                book.getTitle(),
                book.getAuthor().getFirstName(),
                book.getAuthor().getLastName(),
                book.getPublishingYear());
    }
}
