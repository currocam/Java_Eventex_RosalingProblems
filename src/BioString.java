import org.jetbrains.annotations.NotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BioString {
    private final String sequence;
    public BioString(@NotNull String text, String regex) throws Exception {
        this.sequence = text.toUpperCase();
        if (CheckWrongSeq(this.sequence, regex)){
            throw new Exception("This is not a valid seq!");
        }
    }
    private boolean CheckWrongSeq(String text, String regex) {
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);
        return m.find();

    }

    public String getSequence() {
        return sequence;
    }
}
