public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {9,2,5,7,1,3,0,6};
        Helper.printArr(arr);
        Helper.lb();
        bubbleSort(arr);
        Helper.printArr(arr);
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

}
