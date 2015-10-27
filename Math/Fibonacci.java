public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(printFib(6));
        System.out.println(printFibRecursive(6));
    }

    public static int printFib(int n) {
        int sum = 1;
        int prev = 1;
        int next = 1;

        if(n == 0) {
            return 0;
        }
        else if(n == 1) {
            return 1;
        }
        else {
            for(int i = 2; i < n; i++) {
                sum = prev + next;
                prev = next;
                next = sum;
            }
        }
        return sum;
    }

    public static int printFibRecursive(int n) {
        if(n == 0) {
            return 0;
        }
        else if(n == 1) {
            return 1;
        }
        else {
            return printFibRecursive(n - 1) + printFibRecursive(n - 2);
        }
    }
}
