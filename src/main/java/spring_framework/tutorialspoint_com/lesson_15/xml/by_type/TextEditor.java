package spring_framework.tutorialspoint_com.lesson_15.xml.by_type;

public class TextEditor {
    private SpellChecker spellChecker;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // a setter method to inject the dependency.
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
    // a getter method to return spellChecker
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
