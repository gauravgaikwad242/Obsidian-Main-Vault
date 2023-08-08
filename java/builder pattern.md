```
import java.math.BigDecimal;

public class Book {
    private Long id;
    private String isbn;
    private String title;
    private String author;
    private BigDecimal price;
    private String publisher;

    // Private constructor to prevent direct instantiation
    private Book() {
    }

    // Getters and Setters for all fields (omitted for brevity)

    // Nested static Builder class
    public static class BookBuilder {
        private Book book;

        public BookBuilder() {
            book = new Book();
        }

        public BookBuilder setId(Long id) {
            book.id = id;
            return this;
        }

        public BookBuilder setIsbn(String isbn) {
            book.isbn = isbn;
            return this;
        }

        public BookBuilder setTitle(String title) {
            book.title = title;
            return this;
        }

        public BookBuilder setAuthor(String author) {
            book.author = author;
            return this;
        }

        public BookBuilder setPrice(BigDecimal price) {
            book.price = price;
            return this;
        }

        public BookBuilder setPublisher(String publisher) {
            book.publisher = publisher;
            return this;
        }

        public Book build() {
            return book;
        }
    }

    // Static method to create a new BookBuilder instance
    public static BookBuilder builder() {
        return new BookBuilder();
    }
}


Book book = Book.builder()
                .setId(1L)
                .setIsbn("978-9730228236")
                .setTitle("High-Performance Java Persistence")
                .setAuthor("Vlad Mihalcea")
                .setPrice(new BigDecimal("44.99"))
                .setPublisher("Amazon KDP")
                .build();

```