package exercism;
import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        if(languages.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public void addLanguage(String language) {
        this.languages.add(language);
    }

    public void removeLanguage(String language) {
        this.languages.remove(language);
    }

    public String firstLanguage() {
        return this.languages.get(0);
    }

    public int count() {
        return this.languages.size();
    }

    public boolean containsLanguage(String language) {
        if(this.languages.contains(language)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isExciting() {
        return this.languages.contains("java") || this.languages.contains("Kotlin");
    }
    public static void main(String []args){
        LanguageList languageList = new LanguageList();
        languageList.addLanguage("Kotlin");
        languageList.addLanguage("Python");
        System.out.println(languageList.firstLanguage());
        System.out.println((16 & 4) == 1);
    }
}
