public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,4,5,8,9,12,24,27};
		System.out.println(binSearch(arr, 5)); //true
		System.out.println(binSearch(arr, 13)); //false
		System.out.println(binSearch(arr, 27)); //true
		System.out.println(binSearch(arr, 3)); //false
	}

	public static boolean binSearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length;
		int middle = (low + high) / 2;

		while(low <= high) {
			middle = (low + high) / 2;

			if(arr[middle] == target) {
				return true;
			}
			if(arr[middle] > target) {
				high = middle - 1;
			}
			else {
				low = middle + 1;
			}
		}
		return false;
	}

}
