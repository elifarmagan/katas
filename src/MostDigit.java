public class MostDigit {
    public static void main(String[] args) {
        int[] numbers = {33333, 44, 22 , 555555 , 778578584};
        System.out.println(findLongest(numbers));

    }

    public static int findLongest(int[] numbers) {
        int maxDigit = Integer.MIN_VALUE;
        int currentDigit;
        int maxNum = 0;
        for (int i = 0; i < numbers.length ; i++) {
            currentDigit = findLength(numbers[i]);
            if(currentDigit > maxDigit) {
                maxDigit = currentDigit;
                maxNum = numbers[i];
            }
        }
        return maxNum;

    }


    public static int findLength(int num){
        int count = 0;
        num = Math.abs(num);
        while (num > 0) {
            num = num/10;
            count ++ ;
        }
        return count;
    }
}
