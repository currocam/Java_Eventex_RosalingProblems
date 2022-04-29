public class DNAString extends BioString{
    private final String sequence;

    public DNAString(String sequence) throws Exception {
        super(sequence, "[^~`^<ATCG>\\|]");
        this.sequence = sequence;
    }

    public int[] countNucleotides() {
        char[] nucleotides = this.sequence.toCharArray();
        int[] nucleotides_count = new int[4];
        for (char nucleotide : nucleotides) {
            if (nucleotide == 'A'){
                nucleotides_count[0] += 1;
            } else if (nucleotide == 'C') {
                nucleotides_count[1] += 1;
            }
            else if (nucleotide == 'G') {
                nucleotides_count[2] += 1;
            }
            else if (nucleotide == 'T') {
                nucleotides_count[3] += 1;
            }
        }
        return nucleotides_count;
    }
}

