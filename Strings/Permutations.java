public class Permutations {

    /*Generate all permutations for a string */

    public static void main(String[] args) {
       findPermutations("dogs");
    }

                                                //the letter, rest of word
    public static void findPermutationsHelper(String prefix, String word) {

        if(word.length() == 0) {
            System.out.println(prefix);
        }

        for(int i = 0; i < word.length(); i++) {
            String temp = word.substring(0, i) + word.substring(i+1, word.length());
            findPermutationsHelper(prefix + word.substring(i, i+1), temp);
        }
    }

    //wrapper method
    public static void findPermutations(String word) {
        findPermutationsHelper("", word);
    }

}
