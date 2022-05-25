package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;
import static org.apache.commons.lang3.StringUtils.indexOf;

public class Account {
    private static final String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static final String[] translitRepl = {"a","b","v","g","d","e","je","zh","z",
            "y","i","ji", "j", "k","l","m","n","o","p","r","s","t","u","f","h","c", "ch",
            "sh","shh","'","ju","ja"};

    public static String translit(String arg){
        var transOut = new StringBuilder();
        arg = (arg.toLowerCase());
        for (int i = 0; i < arg.length(); i++){
            var originalLetter = String.valueOf(arg.charAt(i));
            if (ukrAlphabet.contains(originalLetter)) {
                var transLetter = translitRepl[indexOf(ukrAlphabet, originalLetter)];
                transOut.append(transLetter);
                }
            else {
                transOut.append(originalLetter);
            }
        }
        return transOut.toString();
    }
}

