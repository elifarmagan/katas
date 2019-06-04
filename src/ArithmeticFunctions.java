public class ArithmeticFunctions {

    public static void main(String[] args) {
        int res = arithmetic(5,6,"multiply");
        System.out.println(res);
    }

    public static int arithmetic(int a, int b, String operator) {
        if(operator.equals("add"))
            return a+b;

        if(operator.equals("subtract"))
            return a-b;

        if(operator.equals("divide"))
            return a/b;


            return a*b;

}

}
