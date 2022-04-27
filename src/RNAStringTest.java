import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class RNAStringTest {
    @Test
    void getSequence() throws Exception {
        RNAString RNA_seq_happy_path = new RNAString("AUGGCC");
        RNAString RNA_seq_lowercase = new RNAString("AUGGcc");
        assertEquals("AUGGCC", RNA_seq_happy_path.getSequence());
        assertEquals("AUGGCC",RNA_seq_lowercase.getSequence());
    }
    @Test
    public void whenWrongCharacterExceptionThrown() {
        try {
            RNAString RNA_seq_wrong = new RNAString("13GGCC");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "This is not a RNA seq!");
        }
    }
}