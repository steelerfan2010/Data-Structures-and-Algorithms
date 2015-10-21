public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {9,2,5,7,1,3,0,6};
        printArr(arr);
        lb();
        bubbleSort(arr);
        printArr(arr);
    }

    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length-1]);
    }

    public static void lb() {
        System.out.println("*************************");
    }

}
