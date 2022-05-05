import java.util.Dictionary;

public class RNAString extends BioString{
    private final String sequence;

    public RNAString(String sequence) throws Exception {
        super(sequence, "[^~`^<AUCG>\\|]");
        this.sequence = sequence;
    }
    public ProteinString translate_into_protein () throws Exception {
        String codon = "";
        String new_seq = "";
        String aa = null;
        Dictionary codonTable = new RNACodonTable().getRNA_Table();
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

