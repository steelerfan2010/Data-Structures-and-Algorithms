//Used to help debug, didnt wanna keep writing these methods

public class Helper {

    //print all my arrays
    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length-1]);
    }

    //lb = line break;
    public static void lb() {
        System.out.println("____________________");
    }

}
