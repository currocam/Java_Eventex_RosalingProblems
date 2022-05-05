import java.util.Dictionary;
import java.util.Hashtable;

public class RNACodonTable {
    private final Dictionary<String, String> RNA_Table;

    public RNACodonTable() {
        RNA_Table = new Hashtable<>();
        RNA_Table.put("UUU", "F");
        RNA_Table.put("UUC", "F");
        RNA_Table.put("UUA", "L");
        RNA_Table.put("UUG", "L");
        RNA_Table.put("UCU", "S");
        RNA_Table.put("UCC", "S");
        RNA_Table.put("UCA", "S");
        RNA_Table.put("UCG", "S");
        RNA_Table.put("UAU", "Y");
        RNA_Table.put("UAC", "Y");
        RNA_Table.put("UAA", "");
        RNA_Table.put("UAG", "");
        RNA_Table.put("UGU", "C");
        RNA_Table.put("UGC", "C");
        RNA_Table.put("UGA", "");
        RNA_Table.put("UGG", "W");

        RNA_Table.put("CUU", "L");
        RNA_Table.put("CUC", "L");
        RNA_Table.put("CUA", "L");
        RNA_Table.put("CUG", "L");
        RNA_Table.put("CCU", "P");
        RNA_Table.put("CCC", "P");
        RNA_Table.put("CCA", "P");
        RNA_Table.put("CCG", "P");
        RNA_Table.put("CAU", "H");
        RNA_Table.put("CAC", "H");
        RNA_Table.put("CAA", "Q");
        RNA_Table.put("CAG", "Q");
        RNA_Table.put("CGU", "R");
        RNA_Table.put("CGC", "R");
        RNA_Table.put("CGA", "R");
        RNA_Table.put("CGG", "R");

        RNA_Table.put("AUU", "I");
        RNA_Table.put("AUC", "I");
        RNA_Table.put("AUA", "I");
        RNA_Table.put("AUG", "M");
        RNA_Table.put("ACU", "T");
        RNA_Table.put("ACC", "T");
        RNA_Table.put("ACA", "T");
        RNA_Table.put("ACG", "T");
        RNA_Table.put("AAU", "N");
        RNA_Table.put("AAC", "N");
        RNA_Table.put("AAA", "K");
        RNA_Table.put("AAG", "K");
        RNA_Table.put("AGU", "S");
        RNA_Table.put("AGC", "S");
        RNA_Table.put("AGA", "R");
        RNA_Table.put("AGG", "R");

        RNA_Table.put("GUU", "V");
        RNA_Table.put("GUC", "V");
        RNA_Table.put("GUA", "V");
        RNA_Table.put("GUG", "V");
        RNA_Table.put("GCU", "A");
        RNA_Table.put("GCC", "A");
        RNA_Table.put("GCA", "A");
        RNA_Table.put("GCG", "A");
        RNA_Table.put("GAU", "D");
        RNA_Table.put("GAC", "D");
        RNA_Table.put("GAA", "E");
        RNA_Table.put("GAG", "E");
        RNA_Table.put("GGU", "G");
        RNA_Table.put("GGC", "G");
        RNA_Table.put("GGA", "G");
        RNA_Table.put("GGG", "G");
    }

    public Dictionary<String, String> getRNA_Table() {
        return RNA_Table;
    }
}
