public class Disvowel {
    public static void main(String[] args) {
        String input = "elif bugun okula geldi";
        String res = disemvowel(input);

        System.out.println(res);
    }

    public static String disemvowel(String str) {

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (!checkVowel(str.charAt(i)))
                res.append(str.charAt(i));
        }

        return res.toString();
    }

    public static boolean checkVowel(char c) {
        final String vowels = "aeiouAEIOU";
        return vowels.contains(Character.toString(c));
    }


}
