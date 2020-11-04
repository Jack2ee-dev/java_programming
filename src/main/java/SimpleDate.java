public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof SimpleDate)) {
            return false;
        }

        SimpleDate comparedDate = (SimpleDate) object;
        if (this.day == comparedDate.day && this.month == comparedDate.month && this.year == comparedDate.year) {
            return true;
        }

        return false;
    }
}
