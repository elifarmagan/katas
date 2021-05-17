public class Factorial {

    public static void main(String[] args) {
        int res = factorial(2);
        System.out.println(res);

    }

    public static int factorial(int n) {
        if (n < 0 || n > 12)
            throw new IllegalArgumentException();

        int result = 1;
        while (n > 0) {
            result *= n;
            n--;
        }

        return result;

    }
}

