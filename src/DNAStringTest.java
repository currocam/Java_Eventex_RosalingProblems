import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DNAStringTest {

    @Test
    void getSequence() throws Exception {
        DNAString DNA_seq_happy_path = new DNAString("AGCTTTT");
        DNAString DNA_seq_lowercase = new DNAString("AGCTTtt");
        assertEquals("AGCTTTT", DNA_seq_happy_path.getSequence());
        assertEquals("AGCTTTT",DNA_seq_lowercase.getSequence());
    }
    @Test
    void countNucleotides() throws Exception{
        String seq = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";
        int[] correct_count = {20,12,17,21};
        DNAString DNA_seq = new DNAString(seq);
        assertTrue(Arrays.equals(correct_count, DNA_seq.countNucleotides()));
    }
    @Test
    void  reverseComplement() throws Exception{
        String seq = "AAAACCCGGT";
        DNAString DNA_seq = new DNAString(seq);
        DNA_seq = DNA_seq.reverseComplement();
        assertEquals("ACCGGGTTTT",DNA_seq.getSequence());
    }
    @Test
    void  transcribing2RNA() throws Exception{
        String seq = "GATGGAACTTGACTACGTAAATT";
        DNAString DNA_seq = new DNAString(seq);
        RNAString RNA_seq = DNA_seq.transcribing2RNA();
        assertEquals("GAUGGAACUUGACUACGUAAAUU",RNA_seq.getSequence());
    }
    @Test
    public void whenWrongCharacterExceptionThrown() {
        try {
            DNAString DNA_seq_wrong = new DNAString("AGCTTTU");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "This is not a valid seq!");
        }
    }
}