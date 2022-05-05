import java.util.Hashtable;

public class DNAString extends BioString {
    private final String sequence;

    public DNAString(String sequence) throws Exception {
        super(sequence, "[^~`^<ATCG>\\|]");
        this.sequence = sequence;
    }

    private static Hashtable<Character, Character> ComplementNucleotides() {
        Hashtable<Character, Character> table = new Hashtable<>();
        table.put('A', 'T');
        table.put('T', 'A');
        table.put('G', 'C');
        table.put('C', 'G');
        return table;
    }

    public DNAString reverseComplement() throws Exception {
        Hashtable<Character, Character> table = ComplementNucleotides();
        char[] array_nucleotides = this.sequence.toCharArray();
        for (int l = 0, h = sequence.length() - 1; l < h; l++, h--) {
            char temp = table.get(array_nucleotides[l]);
            array_nucleotides[l] = table.get(array_nucleotides[h]);
            array_nucleotides[h] = temp;
        }
        String new_seq = String.copyValueOf(array_nucleotides);
        return new DNAString(new_seq);
    }

    public RNAString transcribing2RNA() throws Exception {
        String new_sequence = this.sequence.replace("T", "U");
        return new RNAString(new_sequence);
    }

    public int[] countNucleotides() {
        char[] nucleotides = this.sequence.toCharArray();
        int[] nucleotides_count = new int[4];
        for (char nucleotide : nucleotides) {
            switch (nucleotide) {
                case 'A':
                    nucleotides_count[0] += 1;
                    break;
                case 'C':
                    nucleotides_count[1] += 1;
                    break;
                case 'G':
                    nucleotides_count[2] += 1;
                    break;
                case 'T':
                    nucleotides_count[3] += 1;
                    break;
            }
        }
        return nucleotides_count;
    }
}

