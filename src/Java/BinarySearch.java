public class BinarySearch {
    public static void main(String[] args) {

        /*int [] list = new int[5];
        list[0] = 0;
        list[0] = 1;
        list[0] = 2;*/

        int [] list = {0,1,2,4,5,6,7,7,7,12,13,14};

        int result = binarySearch(list, 0, list.length-1, 7);
        System.out.println(result);

    }

    //it returns the index of given value, otherwise -1
    public static int binarySearch(int[] list, int firstIndex, int lastIndex, int value) {

        int midIndex = (firstIndex + lastIndex) / 2;
        if (list[midIndex] == value)
            return midIndex;

        if (value < list[midIndex])
            return binarySearch(list, firstIndex, midIndex - 1, value);

        return binarySearch(list, midIndex + 1, lastIndex - 1, value);
    }
}
