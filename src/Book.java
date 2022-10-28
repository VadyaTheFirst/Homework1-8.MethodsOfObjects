import java.util.Objects;

public class Book {
    private  int  publishYear;
    private final String bookName;
    private final Author author;


    public Book(int publishYear, String bookName, Author author) {
        this.publishYear = publishYear;
        this.bookName = bookName;
        this.author = author;
    }


    public String getBookName() {
        return bookName;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishingYear(int publishYear) {
        this.publishYear = publishYear;
    }


    @Override
    public String toString() {
        return this.bookName + " " + this.publishYear + " " + this.author.toString();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book bookSecond = (Book) o;
        return (bookName.equals(bookSecond.bookName) && author.equals(bookSecond.author) && Objects.equals(publishYear, bookSecond.publishYear) );

    }


    @Override
    public int hashCode() {
        return Objects.hash(publishYear,author,bookName);
    }
}


