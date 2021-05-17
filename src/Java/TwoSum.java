public class TwoSum {
    public static void main(String[] args) {
        int[] input = {1, 1, 1};

        int[] res = twoSum(input, 2);
        System.out.println(res[0]);
        System.out.println(res[1]);

    }

    public static int[] twoSum(int[] numbers, int target) {

        int[] res = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
}
