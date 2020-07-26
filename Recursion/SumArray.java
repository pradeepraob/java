/**
 * Class having recursive method to add up an integer array using Recursive helper method
 * Passing new sub integer arrays is not effective, so we use internal Helper Methods
 */
public class SumArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("sum of array contains integers: 1,2,3,4,5 is: " + getArraySum(arr));
    }

    /**
     * this method returns the sum of the integers in the passed array
     * @param arr array of integers
     * @return sum of integers in the array
     */
    public static int getArraySum(int[] arr) {
        return getArraySumInternal(arr, 0);
    }

    /**
     * Internal recursive helper method, which takes in same array in each call
     * instead of passing new int array in every recurisve call
     * @param arr
     * @param start
     * @return
     */
    private static int getArraySumInternal(int[] arr, int start) {
        if (start == (arr.length - 1)) {
            return arr[start];
        } else {
            return arr[start] + getArraySumInternal(arr, start + 1);
        }
    }
}