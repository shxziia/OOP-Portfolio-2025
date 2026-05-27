public class Book {

        private String title;
        private String author;
        private String publisher;
        public int copyrightdate;

        public Book(String t, String author, String Publisher, int c) {
            this.title = t;
            this.author = author;
            this.publisher = publisher;
            this.copyrightdate = c;

        }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
            this.author = author;
    }
    public void setPublisher(String publisher) {
            this.publisher = publisher;
    }
    public void setCopyrightdate(int copyrightdate) {
            this.copyrightdate = copyrightdate;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
            return author;
    }
    public String getPublisher() {
            return publisher;
    }
    public int getCopyrightdate() {
            return copyrightdate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", copyrightdate=" + copyrightdate +
                '}';
    }
}


