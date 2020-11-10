public class Book implements Packable {
    private String author;
    private String title;
    private Double weight;

    public Book(String author, String title, Double weight) {
        this.author = author;
        this.title = title;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.title;
    }

    @Override
    public double weight() {
        return this.weight;
    }

}
