import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {

    public static void main(String[] args) {

        System.out.println(isAnagram("foefet", "toffee"));
        System.out.println(isAnagram("Buckethead", "DeathCubeK"));
        System.out.println(isAnagram("Twoo", "Woot"));
        System.out.println(isAnagram("apple", "pale"));
    }

    public static boolean isAnagram(String test, String original) {
        if (test.length() != original.length()) {
            return false;
        }

        List<Character> variable1 = new ArrayList<>();
        List<Character> variable2 = new ArrayList<>();

        test = test.toLowerCase();
        original = original.toLowerCase();

        for (int i = 0; i < test.length(); i++) {
            variable1.add(test.charAt(i));
            variable2.add(original.charAt(i));
        }

        Collections.sort(variable1);
        Collections.sort(variable2);

        return variable1.equals(variable2);
    }
}
