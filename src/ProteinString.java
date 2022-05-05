import java.util.Dictionary;

public class ProteinString extends BioString {
    private final String sequence;

    public ProteinString(String sequence) throws Exception {
        super(sequence, "[^~`^<GPAVLIMCFYWHKQDSTREN>\\|]");
        this.sequence = sequence;
    }

    public int mRNAFromProteinModulo(Integer n_modulo) {
        Dictionary<Character, Integer> proteinTable = new ProteinNumberTable().getProteinNumber_Table();
        char[] array_aa = this.sequence.toCharArray();
        int modulo = 3;
        Integer counter;
        for (char aa : array_aa) {
            counter = proteinTable.get(aa);
            modulo = modulo * counter % n_modulo;
        }
        return modulo;
    }
}