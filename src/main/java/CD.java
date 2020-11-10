public class CD implements Packable {
    private String artist;
    private String name;
    private int publicationYear;

    public CD(String artist, String name, int publciationYear) {
        this.artist = artist;
        this.name = name;
        this.publicationYear = publciationYear;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + "(" + this.publicationYear + ")";
    }

    @Override
    public double weight() {
        return 0.1;
    }

}
