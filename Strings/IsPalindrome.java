public class IsPalindrome {

//Checking if a word is a palindrome

    public static void main(String[] args) {
        System.out.println(isAPalindrome("aba"));
        System.out.println(isAPalindrome("abba"));
        System.out.println(isAPalindrome("racecar"));
        System.out.println(isAPalindrome("a"));
        System.out.println(isAPalindrome("ab"));
        System.out.println(isAPalindrome("abc"));
    }

    public static boolean isAPalindrome(String str) {
        for(int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
