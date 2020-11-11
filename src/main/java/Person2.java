public class Person2 {
    private String name;
    private Education education;

    public Person2(String name, Education education) {
        this.name = name;
        this.education = education;
    }

    public String getName() {
        return this.name;
    }

    public Education getEducation() {
        return this.education;
    }

    @Override
    public String toString() {
        return this.getName() + ", " + this.getEducation();
    }
}
