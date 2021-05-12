package exercises;
import java.util.*;

public class ArrayListPractice {
    public static void main (String[] args) {
        ArrayList<Integer> ints = new ArrayList<>(
                Arrays.asList(10, 423, 54, 345, 234 ,765, 3457, 1398, 4839, 4));

      /*  ArrayList<String> strings = new ArrayList<>(
                Arrays.asList("hello", "yolo", "kleenex", "tomato", "potato", "dog", "caret", "pearl", "a")); */

        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] splitSentence = sentence.split("\\W+");
        ArrayList<String> strList = new ArrayList<>(
                Arrays.asList(splitSentence)
        );

        int sum = 0;
        for (Integer number : ints) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length to search for: ");
        int wordLength = input.nextInt();
        for (String word : strList) {
            if (word.length() == wordLength) {
                System.out.print(word + "\n");
            }
        }

        System.out.println(ints);
        System.out.println((sum));
        System.out.print(Arrays.toString(splitSentence));
    }
}
