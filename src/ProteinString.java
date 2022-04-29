import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProteinString {
    private final String sequence;
    public ProteinString(String text) throws Exception {
        if (!this.isProteinSeq(text.toUpperCase())){
            throw new Exception("This is not a Protein seq!");
        }
        this.sequence = text.toUpperCase();
    }

    private boolean isProteinSeq(String text){
        String pattern = "[^~`^<GPAVLIMCFYWHKQDSTREN>\\|]";
        Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);
        return !m.find();
    }
    public String getSequence() {
        return sequence;
    }
}