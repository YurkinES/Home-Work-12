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
            return authorName + " " + bookName + "  " + publishingAge;
        }
    }


