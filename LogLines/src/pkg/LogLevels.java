package pkg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogLevels {
    public String message(String logLine) {

        String newString = logLine.replaceAll("[\\[\\]a-zA-Z]+:", "").trim();
        

        return newString;
        
    }

    public String logLevel(String logLine) {
        Pattern pt = Pattern.compile("\\[(.+)\\]");
        Matcher mat = pt.matcher(logLine);
        String matchedString = "";

        while(mat.find()) {
            matchedString = mat.group(1).trim().toLowerCase();
        }

        return matchedString;
    }

    public String reformat(String logLine) {
        String finalString = this.message(logLine) + " (" + this.logLevel(logLine) + ")";

        return finalString;
    }
}