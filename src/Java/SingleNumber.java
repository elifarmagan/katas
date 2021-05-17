
public class SingleNumber {

    public static void main(String[] args) {

        int[] input = {4, 1, 2, 1, 2, 4, 5};
        System.out.println(singleNumber(input));

    }

    public static int singleNumber(int[] nums) {
        int res = 0;
        int length = nums.length;


        for (int i = 0; i < length; i++) {
            if (!isContainTwice(nums, nums[i]))
                return nums[i];
        }

        return res;
    }

    public static boolean isContainTwice(int [] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                count++;
        }
        return count == 2 ;


    }

}
