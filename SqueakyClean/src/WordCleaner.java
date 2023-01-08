import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCleaner {

    static String clean(String identifier) {
        
        String toUpperFromKamel = "";

        Pattern pattern = Pattern.compile("(?<=-)(\\W|\\w)");
        Matcher matcher = pattern.matcher(identifier);
        
        while(matcher.find()) {
            toUpperFromKamel = matcher.group(1);
        }

        identifier = identifier.replace(" ", "_");
        identifier = identifier.replaceAll("\\p{Cntrl}", "CTRL");
        identifier = identifier.replaceAll("(\\-(\\W|\\w))", toUpperFromKamel.toUpperCase());
        identifier = identifier.replaceAll("[^_\\p{IsLatin}Α-Ωa-zA-Z\u00C0-\u00FF]*", "");
        identifier = identifier.replaceAll("[α-ω]*", "");

        return identifier;
    }
}