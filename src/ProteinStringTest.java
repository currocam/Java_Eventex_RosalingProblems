import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProteinStringTest {

    @Test
    void getSequence() throws Exception {
        ProteinString seq_happy_path = new ProteinString("AGGCCAGGCGCCCAGA");
        ProteinString seq_lowercase = new ProteinString("AGGCCAGGCGCCCaga");
        ProteinString seq_short = new ProteinString("FFLL");
        assertEquals("FFLL", seq_short.getSequence());
        assertEquals("AGGCCAGGCGCCCAGA", seq_happy_path.getSequence());
        assertEquals("AGGCCAGGCGCCCAGA",seq_lowercase.getSequence());
    }
    @Test
    public void whenWrongCharacterExceptionThrown() {
        try {
            ProteinString seq_wrong = new ProteinString("XXXXZZZ");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "This is not a Protein seq!");
        }
    }
}