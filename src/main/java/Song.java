public class Song {
    private String name;
    private String author;
    private int length;

    public Song(String name, String author, int length) {
        this.name = name;
        this.author = author;
        this.length = length;
    }

    public String name() {
        return this.name;
    }

    public int length() {
        return this.length;
    }

    public String author() {
        return this.author;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Song)) {
            return false;
        }

        Song comparedSong = (Song) compared;
        if (this.name == comparedSong.name && this.length == comparedSong.length
                && this.author == comparedSong.author) {
            return true;
        }

        return false;
    }
}
