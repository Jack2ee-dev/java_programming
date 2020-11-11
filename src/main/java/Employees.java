import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employees {
    private List<Person2> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person2 personToAdd) {
        this.employees.add(personToAdd);
    }

    public void add(List<Person2> peopleToAdd) {
        for (Person2 p : peopleToAdd) {
            this.add(p);
        }
    }

    public void print() {
        Iterator<Person2> iterator = employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        List<Person2> filtered = employees.stream().filter(e -> e.getEducation().equals(education))
                .collect(Collectors.toCollection(ArrayList::new));
        Iterator<Person2> iterator = filtered.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void fire(Education education) {
        Iterator<Person2> iterator = employees.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
