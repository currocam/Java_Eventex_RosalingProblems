import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProteinString extends BioString{
    private final String sequence;
    public ProteinString(String sequence) throws Exception {
        super(sequence, "[^~`^<GPAVLIMCFYWHKQDSTREN>\\|]");
        this.sequence = sequence;
    }
}