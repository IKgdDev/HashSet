import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private Set<String> setWords;

    public WordsChecker(String text) {

        String[] wordsArray = text.split("\\P{IsAlphabetic}+");
        setWords = new HashSet<>();

        for (String word : wordsArray) {
            setWords.add(word);
        }
    }

    public boolean hasWord(String word) {
        return setWords.contains(word);
    }
}
