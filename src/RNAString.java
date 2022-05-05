import java.util.Dictionary;

public class RNAString extends BioString {
    private final String sequence;

    public RNAString(String sequence) throws Exception {
        super(sequence, "[^~`^<AUCG>\\|]");
        this.sequence = sequence;
    }

    public ProteinString translate_into_protein() throws Exception {
        String codon;
        StringBuilder new_seq = new StringBuilder();
        String aa;
        Dictionary<String, String> codonTable = new RNACodonTable().getRNA_Table();
        for (int i = 0; i < sequence.length() - 3; i = i + 3) {
            codon = sequence.substring(i, i + 3);
            aa = codonTable.get(codon);
            if (aa.isEmpty()) {
                break;
            }
            new_seq.append(aa);
        }
        return new ProteinString(new_seq.toString());
    }
}

