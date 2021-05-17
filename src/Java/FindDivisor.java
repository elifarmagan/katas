public class FindDivisor {

    public static void main(String[] args) {

        System.out.println(numberOfDivisors(30));

    }

    public static long numberOfDivisors(int n) {
        long res = 0;
        int count = 1;

        while (count < n) {
            if (n % count == 0)
                res++;

            count++;

        }

        return res + 1;

    }


}
