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

    @Test
    void translate_into_protein() throws Exception {
        RNAString RNA_seq_with_stop = new RNAString("UUUUUCUUAUUGUAA");
        ProteinString protein_with_stop = RNA_seq_with_stop.translate_into_protein();
        assertEquals("FFLL",protein_with_stop.getSequence());


        RNAString RNA_seq = new RNAString("AUGGCCAUGGCGCCCAGAACUGAGAUCAAUAGUACCCGUAUUAACGGGUGA");
        ProteinString protein = RNA_seq.translate_into_protein();
        assertEquals("MAMAPRTEINSTRING",protein.getSequence());

    }
}