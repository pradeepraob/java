/**
 * StringPalindrome class has utility method to check if given string is a palindrome
 */
public class StringPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal, Panama!";
        System.out.println(str);
        System.out.println(isPalindrome(str));

        str = "adam, I'm Ada";
        System.out.println(str);
        System.out.println(isPalindrome(str));
    }

    /**
     * isPalindrome method would check if the passed string is a palindrome
     * it checks using recursive method
     * @param str
     * @return true if str is palindrome, e.g. civic, level, radar, rotor, kayak, madam
     */
    public static boolean isPalindrome(String str) {
        //if str is null or empty, it is palindrome
        if (str == null || str.equals("")) {
            return true;
        }
        int len = str.length();
        //if len of string is 1, i.e. single character, it is palindrome
        if (len <= 1) {
            return true;
        } else {
            //check if first and last characters of the string are same
            //if yes, remove those characters, and recursively call same method
            char firstChar = Character.toLowerCase(str.charAt(0));
            char lastChar = Character.toLowerCase(str.charAt(len-1));
            if (Character.isLetter(firstChar) && Character.isLetter(lastChar)) {
                if (firstChar == lastChar) {
                    return isPalindrome(str.substring(1, len - 1));
                } else {
                    return false;
                }
            } 
            //if either first or last character of the string are not letters,
            //we shall remove them and check again recursively
            else if (!Character.isLetter(firstChar)) {
                return isPalindrome(str.substring(1));
            } else {
                return isPalindrome(str.substring(0, len - 1));
            }
        }
    }
}