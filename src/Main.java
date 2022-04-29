public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Sample Dataset");
        RNAString seq = new RNAString("AUGGCCAUGGCGCCCAGAACUGAGAUCAAUAGUACCCGUAUUAACGGGUGA");
        System.out.println(seq.getSequence());
        System.out.println("Sample output");
        System.out.println(seq.translate_into_protein().getSequence());
    }
}