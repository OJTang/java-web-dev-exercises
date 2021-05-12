package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main (String[] args) {
        int[] arr = {1, 1, 2, 3, 5, 8};
        for (int j : arr) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] sentenceArr = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArr));

        String[] sentenceDelimiter = sentence.split("\\.");
        System.out.println(Arrays.toString(sentenceDelimiter));
    }
}
