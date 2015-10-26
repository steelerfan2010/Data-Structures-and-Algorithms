import java.util.HashMap;
import java.util.Map;

public class ThreeSum {

/* Are there 3 numbers in an array that add up to a target number? */

	public static void main(String[] args) {
		int[] x = {1,2,3,4,5,6,7,8,9};
		System.out.println(hasThreeSum(x, 14)); //true
		System.out.println(hasThreeSum(x, 5)); //false
		System.out.println(hasThreeSum(x, 25)); //false
	}

	public static boolean hasThreeSum(int[] arr, int target) {
		Map<Integer, Integer> numbers = populateMap(arr);	
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j  < arr.length; j++) {
				int twoSum = arr[i] + arr[j];
				int difference = target - twoSum;
				if(numbers.containsKey(difference) && i != numbers.get(difference) && j != numbers.get(difference)) {
					System.out.println("Goal: " + target + " Three numbers: " + arr[i] + "," + arr[j] + "," + difference);
					return true;
				}
			}
		}
		return false;
	}

	public static Map<Integer, Integer> populateMap(int[] arr) {
		Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();	

		for(int i = 0; i < arr.length; i++) {
			numbers.put(arr[i], i);			
		}
		return numbers;
	}

}
