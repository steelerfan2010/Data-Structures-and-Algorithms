import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("hey", "how")); //false
        System.out.println(isAnagram("will", "lliw")); //true
        System.out.println(isAnagram("livesey", "yesevil")); //true
        System.out.println(isAnagram("tons", "tone")); //false
        System.out.println(isAnagram("calendar", "calandar")); //false

        System.out.println("***********************************");

        System.out.println(isAnagramAlt("hey", "how")); //false
        System.out.println(isAnagramAlt("will", "lliw")); //true
        System.out.println(isAnagramAlt("livesey", "yesevil")); //true
        System.out.println(isAnagramAlt("tons", "tone")); //false
        System.out.println(isAnagramAlt("calendar", "calandar")); //false
   
    }

    //O(n) runtime
    //O(n) memory
    public static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> charCount = getCharCount(s1);
        for(int i = 0; i < s2.length(); i++) {
            if((charCount.containsKey(s2.charAt(i))) && (charCount.get(s2.charAt(i)) > 0)) {
                int value = charCount.get(s2.charAt(i));
                value--;
                charCount.put(s2.charAt(i), value);
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static Map<Character, Integer> getCharCount(String s1) {
        Map<Character, Integer> charCount = new HashMap<Character, Integer>();
        for(int i = 0; i < s1.length(); i++) {
            if(charCount.containsKey(s1.charAt(i))) {
                int currentCharCount = charCount.get(s1.charAt(i));
                currentCharCount++;
                charCount.put(s1.charAt(i), currentCharCount);
            }
            else {
                charCount.put(s1.charAt(i), 1);
            }
        }
        return charCount;
    }

    //O(n log(n)) runtime
    //O(1) memory (if sorted in place)
    public static boolean isAnagramAlt(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i = 0; i < c1.length; i++) {
            if(c1[i] != c2[i]) {
                return false;
            }
        }
        return true;
    }

}
