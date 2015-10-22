public class Quicksort {

	public static void main(String[] args) {
		int[] x = {9,6,3,1,2,8,7,0,4,5};
		printArr(x);
		quicksort(x, 0, x.length-1);
		printArr(x);
	}

	public static void quicksort(int[] arr, int low, int high) {
		int i = low;
		int j = high;
		int middle = (high + low) / 2;
		int pivot = arr[middle];

		while(i <= j) {
			while(arr[i] < pivot) {
				i++;
			}
			while(arr[j] > pivot) {
				j--;
			}
			if(i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		if(j > low) {	
			quicksort(arr, low, j);
		}
		if(i < high) {
			quicksort(arr, i, high);
		}	
	}

	public static void printArr(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println(arr[arr.length-1]);
	}

}
