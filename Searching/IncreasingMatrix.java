public class IncreasingMatrix {

	/* Given a 2D array where each number in the row increases,
		and each number in the column increases, determine
		if a number is in the array				*/

	public static void main(String[] args) {
		int[][] arr = {{1,3,5,7}, {2,4,6,8}, {5,10,11,12}};
		System.out.println(containsNumber(arr, 3)); //true
		System.out.println(containsNumber(arr, 9)); //false
		System.out.println(containsNumber(arr, 10)); //true
		System.out.println(containsNumber(arr, 0)); //false
	
	}

	public static boolean containsNumber(int[][] arr, int target) {
		int colIndex = 3; //length of column - 1
		int rowIndex = 0;

		int i = 0;
		while(true)  {
			if(arr[rowIndex][colIndex] == target) {
				return true;
			}
			if(arr[rowIndex][colIndex] > target) {
				colIndex--;			
			}
			else {
				rowIndex++;
			}

			if((rowIndex > 2) || (colIndex < 0)) {
				return false;
			}

			i++;
		}
	}

}
