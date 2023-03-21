import java.util.Objects;

public class Book {
        private String bookName;
        private int publishingAge;
        private Author authorName;


        public Book(Author authorName, String bookName, int publishingAge) {
            this.authorName = authorName;
            this.bookName = bookName;
            this.publishingAge = publishingAge;
        }
        public Author getAuthorName(){
            return this.authorName;
        }

        public String getBookName() {
            return this.bookName;
        }
        public int getPublishingAge() {
            return  this.publishingAge;
        }
        public void setPublishingAge(int publishingAge) {
            this.publishingAge = publishingAge;
        }
        public String toString(){
            return authorName + ", " + bookName + ",  " + publishingAge + " год";
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName);
    }
}


