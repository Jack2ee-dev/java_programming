import java.util.HashMap;
import java.util.Map;

public class Abbreviations {
    Map<String, String> abbreviations = new HashMap<>();

    public Abbreviations() {
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (abbreviations.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation) {
        return abbreviations.get(abbreviation);
    }
}
