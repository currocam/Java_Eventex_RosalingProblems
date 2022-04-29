import java.util.Dictionary;
import java.util.Hashtable;

public class RNACodonTable {
    public Dictionary getTable() {
        return table;
    }
    private final Dictionary table;
    public RNACodonTable() {
        table  =  new Hashtable();
        table.put("UUU", "F");
        table.put("UUC", "F");
        table.put("UUA", "L");
        table.put("UUG", "L");
        table.put("UCU", "S");
        table.put("UCC", "S");
        table.put("UCA", "S");
        table.put("UCG", "S");
        table.put("UAU", "Y");
        table.put("UAC", "Y");
        table.put("UAA", "");
        table.put("UAG", "");
        table.put("UGU", "C");
        table.put("UGC", "C");
        table.put("UGA", "");
        table.put("UGG", "W");

        table.put("CUU", "L");
        table.put("CUC", "L");
        table.put("CUA", "L");
        table.put("CUG", "L");
        table.put("CCU", "P");
        table.put("CCC", "P");
        table.put("CCA", "P");
        table.put("CCG", "P");
        table.put("CAU", "H");
        table.put("CAC", "H");
        table.put("CAA", "Q");
        table.put("CAG", "Q");
        table.put("CGU", "R");
        table.put("CGC", "R");
        table.put("CGA", "R");
        table.put("CGG", "R");

        table.put("AUU", "I");
        table.put("AUC", "I");
        table.put("AUA", "I");
        table.put("AUG", "M");
        table.put("ACU", "T");
        table.put("ACC", "T");
        table.put("ACA", "T");
        table.put("ACG", "T");
        table.put("AAU", "N");
        table.put("AAC", "N");
        table.put("AAA", "K");
        table.put("AAG", "K");
        table.put("AGU", "S");
        table.put("AGC", "S");
        table.put("AGA", "R");
        table.put("AGG", "R");

        table.put("GUU", "V");
        table.put("GUC", "V");
        table.put("GUA", "V");
        table.put("GUG", "V");
        table.put("GCU", "A");
        table.put("GCC", "A");
        table.put("GCA", "A");
        table.put("GCG", "A");
        table.put("GAU", "D");
        table.put("GAC", "D");
        table.put("GAA", "E");
        table.put("GAG", "E");
        table.put("GGU", "G");
        table.put("GGC", "G");
        table.put("GGA", "G");
        table.put("GGG", "G");

    }
}
