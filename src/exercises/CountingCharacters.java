package exercises;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class CountingCharacters {
    public static void main(String[] args) throws IOException {
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence to count the letters: ");

        String string = input.nextLine();

        input.close();*/

        String file = "C:/Java Projects/java-web-dev-exercises/src/exercises/CountingCharsSentence.txt";
        Path path = Paths.get(file);
        List<String> lines = Files.readAllLines(path);
        Object[] string = lines.toArray();
        String string2 = Arrays.toString(string);

        String[] wordsInString = string2.toLowerCase().split("\\W+");
        String rejoinedString = String.join("", wordsInString);
        char[] charactersInString = rejoinedString.toCharArray();

        HashMap<Character, Integer> letterMap = new HashMap<>();


        for (char letter : charactersInString) {
            if (!letterMap.containsKey(letter)) {
                int letterCount = 1;
                letterMap.put(letter, letterCount);
            } else if (letterMap.containsKey(letter)) {
                letterMap.put(letter, letterMap.get(letter) + 1);
            }
        }


        System.out.println(letterMap);
    }
}
