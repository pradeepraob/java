public class ReverseInteger
{
    public static void main(String[] args) {
        // System.out.println("3456: " + reverseInteger(3456));
        // System.out.println("3: " + reverseInteger(3));
        // System.out.println("0: " + reverseInteger(0));
        // System.out.println("100: " + reverseInteger(100));
        System.out.println("-10: " + reverseInteger(-10));
    }

    public static int reverseInteger(int num) {
        if(num < 10 && num >= 0)
        {
            return num;
        }
        else
        {
            return ((num % 10) * tensPower(numOfDigits(num / 10)) ) + reverseInteger(num / 10);
        }
        // return 0;
    }
    private static int tensPower(int num)
    {
        if( num <=0)
        {
            return 1;
        }
        else
        {
            return 10 * tensPower(num-1);
        }
        // return 0;
    }
    private static int numOfDigits(int num)
    {
        if( num < 10)
        {
            return 1;
        }
        else
        {
            return 1 + numOfDigits(num / 10);
        }
        // return 0;
    }
}