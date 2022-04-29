import java.nio.charset.StandardCharsets;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RNAString {
    private final String sequence;
    public RNAString(String text) throws Exception {
        if (!this.isRNASeq(text)){
            throw new Exception("This is not a RNA seq!");
        }
        this.sequence = text.toUpperCase();
    }
    private boolean isRNASeq(String text){
        Pattern p = Pattern.compile("[^~`^<AUCG>\\|]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);
        return !m.find();
    }
    public String getSequence() {
        return sequence;
    }

    public ProteinString translate_into_protein () throws Exception {
        String codon = "";
        String new_seq = "";
        String aa = null;
        Dictionary codonTable = new RNACodonTable().getTable();
        for (int i = 0; i < sequence.length()-3; i =i+3){
            codon = sequence.substring(i, i+3);
            aa = (String) codonTable.get(codon);
            if (aa.isEmpty()){
                break;
            }
            new_seq +=aa;
        }
        return new ProteinString(new_seq);
    }
}

