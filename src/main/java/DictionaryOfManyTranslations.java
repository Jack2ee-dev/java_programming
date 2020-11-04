import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryOfManyTranslations {
    private Map<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.translations.putIfAbsent(word, new ArrayList<>());

        List<String> translations = this.translations.get(word);
        translations.add(translation);
    }

    public ArrayList<String> translate(String word) {
        return this.translations.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        this.translations.remove(word);
    }
}
