public class Book implements Comparable<Book>{
    private String title;
    private double price;
    private int publicationYear;
    private String author;

    public Book(String title, double price, int publicationYear, String author){
        this.title = title;
        this.price = price;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", publicationYear=" + publicationYear +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {

        return Integer.compare(this.publicationYear, o.publicationYear);
    }
}

