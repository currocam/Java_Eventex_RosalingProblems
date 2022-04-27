import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RNAString {
    private final String sequence;
    public RNAString(String text) throws Exception {
        if (this.isRNASeq(text)){
            throw new Exception("This is not a RNA seq!");
        }
        this.sequence = text.toUpperCase();
    }
    private boolean isRNASeq(String text){
        Pattern p = Pattern.compile("[^AUGC]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);
        return m.find();
    }
    public String getSequence() {
        return sequence;
    }
}
