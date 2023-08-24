import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numsArray = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < numsArray.length; i++) {
            if (numsArray[i] % 2 == 1) {
                System.out.print(numsArray[i] + " ");
            }
        }
        stringPractice();
    }
    public static void stringPractice() {
        String practiceStr = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = practiceStr.split(" ");
        System.out.println(Arrays.toString(words));
        String[] sentences = practiceStr.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
