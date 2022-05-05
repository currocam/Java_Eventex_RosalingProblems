import java.util.Dictionary;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProteinString extends BioString{
    private final String sequence;
    public int mRNAFromProteinModulo (Integer n_modulo){
        Dictionary proteinTable = new RNACodonTable().getProtein_Table();
        char[] array_aa = this.sequence.toCharArray();
        Integer modulo = 3;
        Integer counter ;
        for (char aa : array_aa) {
            counter = (Integer) proteinTable.get(aa);
            modulo = modulo*counter%n_modulo;
        }
        return modulo;
    }
    public ProteinString(String sequence) throws Exception {
        super(sequence, "[^~`^<GPAVLIMCFYWHKQDSTREN>\\|]");
        this.sequence = sequence;
    }
}