import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramList {

	public static void main(String[] args) {
		String[] words = {"dog", "elvis", "forest", "fortes", "foster", "goat",
			"god", "hero", "horse", "lives", "shore", "softer"};

		System.out.println(getAnagramLists(words).toString());
	}

	public static ArrayList<ArrayList<String>> getAnagramLists(String[] words) {
		ArrayList<ArrayList<String>> anagramLists = new ArrayList<ArrayList<String>>();

		Map<String, ArrayList<String>> solution = new HashMap<String, ArrayList<String>>();

		for(int i = 0; i < words.length; i++) {
			char[] sortWordArray = words[i].toCharArray();
			Arrays.sort(sortWordArray);
			String sortedWord = new String(sortWordArray);

			if(solution.containsKey(sortedWord)) {
				solution.get(sortedWord).add(words[i]);
			}
			else {
				ArrayList<String> addMe = new ArrayList<String>();
				addMe.add(words[i]);
				solution.put(sortedWord, addMe);
			}
		}

		for(String key: solution.keySet()) {
			ArrayList<String> addThis = solution.get(key);
			anagramLists.add(addThis);
		}

		return anagramLists;
	}

}
