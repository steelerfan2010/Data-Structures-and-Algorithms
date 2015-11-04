public class Rotate {

    /* Rotate an array 90 degrees */

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
    }

    public static void rotate(int[][] arr) {
        int[][] solution = new int[arr.length][arr.length];

        for(int i  = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                solution[i][j] = arr[n - 1 - j][i];
            }
        }
        return solution;
    }

}
