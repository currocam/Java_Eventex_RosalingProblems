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
        int[] correct_count = new int [4];
        correct_count[0] = 20;
        correct_count[1] = 12;
        correct_count[2] = 17;
        correct_count[3] = 21;
        DNAString DNA_seq = new DNAString(seq);
        assertTrue(Arrays.equals(correct_count, DNA_seq.countNucleotides()));
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