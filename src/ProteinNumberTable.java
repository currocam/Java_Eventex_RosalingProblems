import java.util.Dictionary;
import java.util.Hashtable;

public class ProteinNumberTable {
    private final Dictionary<Character, Integer> ProteinNumber_Table;

    public ProteinNumberTable() {
        ProteinNumber_Table = new Hashtable<>();
        ProteinNumber_Table.put('F', 2);
        ProteinNumber_Table.put('L', 6);
        ProteinNumber_Table.put('S', 6);
        ProteinNumber_Table.put('Y', 2);
        ProteinNumber_Table.put('C', 2);
        ProteinNumber_Table.put('W', 1);
        ProteinNumber_Table.put('P', 4);
        ProteinNumber_Table.put('H', 2);
        ProteinNumber_Table.put('Q', 2);
        ProteinNumber_Table.put('R', 6);
        ProteinNumber_Table.put('I', 3);
        ProteinNumber_Table.put('M', 1);
        ProteinNumber_Table.put('T', 4);
        ProteinNumber_Table.put('N', 2);
        ProteinNumber_Table.put('K', 2);
        ProteinNumber_Table.put('V', 4);
        ProteinNumber_Table.put('A', 4);
        ProteinNumber_Table.put('D', 2);
        ProteinNumber_Table.put('E', 2);
        ProteinNumber_Table.put('G', 4);
    }

    public Dictionary<Character, Integer> getProteinNumber_Table() {
        return ProteinNumber_Table;
    }


}
