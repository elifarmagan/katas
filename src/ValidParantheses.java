import java.util.*;

public class ValidParantheses {
    public static void main(String[] args) {


        System.out.println(IsValid2("[[[()]"));
        System.out.println(IsValid2("[({(})]"));
        System.out.println(IsValid2("()[]{}"));
        System.out.println(IsValid2("(){]{}"));

    }

    private static boolean IsValid(String input) {
        if (input == null || input.equals("")) {
            return true;
        }
        if (input.length() == 1 || input.length() % 2 != 0) {
            return false;
        }
        char[] var = input.toCharArray();

        //(),{},[]

        Stack<Character> stack = new Stack<>();

        for (char item : var) {
            stack.push(item);
        }
        Map<Character, Character> parantheseTypes = new HashMap<>();
        parantheseTypes.put('(', ')');
        parantheseTypes.put('{', '}');
        parantheseTypes.put('[', ']');
        parantheseTypes.put(')', '(');
        parantheseTypes.put('}', '{');
        parantheseTypes.put(']', '[');

        Set<Character> openingParantheses = new HashSet<>();
        openingParantheses.add('(');
        openingParantheses.add('{');
        openingParantheses.add('[');

        Set<Character> closingParantheses = new HashSet<>();
        closingParantheses.add(')');
        closingParantheses.add('}');
        closingParantheses.add(']');

        int size = stack.size();


        Character firstElem = stack.peek();
        Character prevElement = stack.pop();

        if (!closingParantheses.contains(prevElement)) {
            return false;
        }
        List<Character> list = new ArrayList<>();
        for (int i = 1; i < size; i++) {
            Character currentElement = stack.peek();
            Character firstType = parantheseTypes.get(firstElem);
            if (stack.size() == 1 && firstType.equals(currentElement)) {
                return true;
            }
            if (openingParantheses.contains(currentElement)) {
                Character type = parantheseTypes.get(prevElement);
                if (type.equals(currentElement)) {
                    prevElement = stack.pop();
                } else {
                    return false;
                }
            } else {
                prevElement = stack.peek();
                list.add(stack.pop());
            }
        }
        return true;
    }

    private static boolean IsValid2(String s) {
        char[] inp = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        Set<Character> openingParantheses = new HashSet<>();
        openingParantheses.add('(');
        openingParantheses.add('{');
        openingParantheses.add('[');

        Map<Character, Character> parantheseTypes = new HashMap<>();
        parantheseTypes.put('(', ')');
        parantheseTypes.put('{', '}');
        parantheseTypes.put('[', ']');
        parantheseTypes.put(')', '(');
        parantheseTypes.put('}', '{');
        parantheseTypes.put(']', '[');


        for (int i = 0; i < s.length(); i++) {
            if(openingParantheses.contains(inp[i])){
                stack.push(inp[i]);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                Character inpType = parantheseTypes.get(inp[i]);
                char topElement = stack.peek();
                if(inpType.equals(topElement)){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
