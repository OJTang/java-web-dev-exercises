package exercises;
import java.util.Locale;
import java.util.Scanner;

public class AliceStringSearch {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String aliceSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Enter a word to search for: ");
        String inputWord = input.nextLine();
        if (aliceSentence.toUpperCase().contains(inputWord.toUpperCase())) {
            System.out.println(aliceSentence.toUpperCase().indexOf(inputWord.toUpperCase()));
            System.out.print(inputWord.length());
            String newSentence = aliceSentence.replace(inputWord, "");
            System.out.print("\r\n" + newSentence);
            input.close();
        } else {
            System.out.println("False");
            input.close();
        }
    }
}
