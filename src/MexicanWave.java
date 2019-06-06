
public class MexicanWave {

    /*1.  The input string will always be lower case but maybe empty.
    2.  If the character in the string is whitespace then pass over it as if it was an empty seat.
    wave("hello") => ["Hello", "hEllo", "heLlo", "helLo", "hellO"]*/

    public static void main(String[] args) {
        String input = "two words";
        String[] res = wave(input);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }

    public static String[] wave(String str) {
        if (str == null)
            return null;

        int length = str.length();
        int resLenght = length - str.replaceAll("[^ ]", "").length();
        String[] res = new String[resLenght];
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {

                res[count] = makeUpper(str, i);
                count++;
            }
        }
        return res;
    }

    public static String makeUpper(String str, int index) {

        int length = str.length();
        char upperChar = Character.toUpperCase(str.charAt(index));
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {

            if (Character.isWhitespace(str.charAt(i)))
                stringBuilder.append(' ');
            else if (i == index)
                stringBuilder.append(upperChar);
            else
                stringBuilder.append(str.charAt(i));

        }
        return stringBuilder.toString();
    }
}
