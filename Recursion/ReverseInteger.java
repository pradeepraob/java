/**
 * ReverseInteger is a class to get the number in reverse order for e.g. calling
 * ReverseInteger.reverseInteger(3456) would return 6543
 */
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println("3456: " + reverseInteger(3456));
        System.out.println("3: " + reverseInteger(3));
        System.out.println("0: " + reverseInteger(0));
        System.out.println("100: " + reverseInteger(100));
        System.out.println("-10: " + reverseInteger(-10));
    }

    /**
     * reverseInteger would reverse the order of digits in given integer
     * 
     * @param num integer to be reversed
     * @return reversed integer e.g. 3456 would reversed as 6543
     */
    public static int reverseInteger(int num) {
        // if num is between 0 to 9, reverse would be same
        if (num < 10 && num >= 0) {
            return num;
        }
        // else we need to extract the unit's place, multiply it by tens power of # of
        // digits left
        // so that unit's place is moved to left most place in given number
        // remaining number would be again called on same method to recursively reverse
        // remaining #
        else {
            return ((num % 10) * tensPower(numOfDigits(num / 10))) + reverseInteger(num / 10);
        }
    }

    /**
     * returns the value of 10 to the power of passed num this is calculated
     * recursively
     * 
     * @param num
     * @return
     */
    private static int tensPower(int num) {
        // if num is 0, 10 power of it is 1
        if (num <= 0) {
            return 1;
        }
        // else, we can calculate 10 * recursively get value for remaining value
        else {
            return 10 * tensPower(num - 1);
        }
    }

    /**
     * returns the # of digits in the given number e.g. 100 would return 3
     * 
     * @param num
     * @return no. of digits in the given number
     */
    private static int numOfDigits(int num) {
        // number of digits in number < 10 is 1
        if (num < 10) {
            return 1;
        }
        // else, we increment value and recursively call same method on remaining digits
        else {
            return 1 + numOfDigits(num / 10);
        }
    }
}