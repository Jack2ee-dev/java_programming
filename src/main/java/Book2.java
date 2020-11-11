public class Book2 {
    private String name;
    private int recommendedAge;

    public Book2(String name, int recommendedAge) {
        this.name = name;
        this.recommendedAge = recommendedAge;
    }

    public String getName() {
        return this.name;
    }

    public int getRecommendedAge() {
        return this.recommendedAge;
    }

    @Override
    public String toString() {
        return this.getName() + " (recommended for " + this.getRecommendedAge() + " year-olds or older)";
    }
}
