public class RecursiveMultiply {

    private static int recursiveMultiplyHelper(int m, int n) {
        if (n == 0) {
            return 0;
        }
        int sum = ((n & 1) == 1) ? m : 0;
        return sum + recursiveMultiply(m << 1, n >> 1);
    }

    public static int recursiveMultiply(int m, int n) {
        return recursiveMultiplyHelper(Math.max(m, n), Math.min(m, n));
    }

    public static void main(String[] args) {
        boolean testsPassed = true;
        for (int i = 1; i < 1000; i++) {
            for (int j = i; j < 1000; j++) {
                if (recursiveMultiply(i, j) != i * j) {
                    testsPassed = false;
                }
            }
        }
        System.out.println("Tests Passed? " + testsPassed);
    }

}
