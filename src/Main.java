import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        int option = 1;
        Scanner scanner = new Scanner(System.in);
        String sequence = AddFirstSequenceMenu(scanner);
        while (option!=7){
            printMenu(options);
            try {
                option = scanner.nextInt();
                switch (option){
                    case 1: countNucleotidesMenu(sequence); break;
                    case 2: ReverseNucleotidesMenu(sequence);break;
                    case 3: Transcribing2RNAMenu(sequence);break;
                    case 4: TranslateRNAMenu(sequence);break;
                    case 5: InferingModuloRNAMenu(scanner, sequence);break;
                    case 6: sequence = AddNewSequenceMenu(scanner);break;
                    case 7: exit(0);
                }
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }
    public static void printMenu(String[] options){
        for (String option : options){
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }
    private static final String[] options = {
            "1- Count the number of nucleotides in a DNA sequence. ",
            "2- Obtain the complementary strand of a DNA sequence.",
            "3- Transcribe a DNA sequence into RNA:",
            "4- Translate a RNA sequence to protein.",
            "5- Infer the number of mRNAs from which the protein sequence could have come.",
            "6- Enter a new sequence.",
            "7- Exit."
    };

    @NotNull
    private static String AddNewSequenceMenu(Scanner scanner) {
        System.out.print("Enter your sequence: ");
        scanner.nextLine();
        String sequence = scanner.nextLine().toString();
        return sequence;
    }
    private static String AddFirstSequenceMenu(Scanner scanner) {
        System.out.print("Enter your sequence: ");
        String sequence = scanner.nextLine().toString();
        return sequence;
    }

    private static void ReverseNucleotidesMenu(String sequence) throws Exception {
        DNAString seqDNA = new DNAString(sequence);
        seqDNA = seqDNA.reverseComplement();
        System.out.println(seqDNA.getSequence());
    }
    public static void countNucleotidesMenu(String sequence) throws Exception {
        DNAString seqDNA = new DNAString(sequence);
        int[] array_nucleotides = seqDNA.countNucleotides();
        System.out.println("A, C, G, T");
        System.out.println(Arrays.toString(array_nucleotides));
    }
    private static void Transcribing2RNAMenu(String sequence) throws Exception {
        DNAString seqDNA = new DNAString(sequence);
        RNAString seqRNA = seqDNA.transcribing2RNA();
        System.out.println(seqRNA.getSequence());
    }
    private static void TranslateRNAMenu(String sequence) throws Exception {
        RNAString seqRNA = new RNAString(sequence);
        ProteinString seqProtein = seqRNA.translate_into_protein();
        System.out.println(seqProtein.getSequence());
        return;
    }
    private static void InferingModuloRNAMenu(Scanner scanner, String sequence) throws Exception {
        ProteinString seqProtein = new ProteinString(sequence);
        System.out.println("Introduce your desired modulo:");
        scanner.nextLine();
        int modulo = scanner.nextInt();
        System.out.println(seqProtein.mRNAFromProteinModulo(modulo));
    }
}



