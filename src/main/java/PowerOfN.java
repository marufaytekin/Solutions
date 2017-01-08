import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by maruf on 1/8/17.
 */
public class PowerOfN {

    public static void main(String[] args) {

        // is 100 power of 10?
        System.out.println(isPowerOfN(100, 10));
        // is 100 power of 5?
        System.out.println(isPowerOfN(100, 5));

        // is 100 power of 10?
        System.out.println(isPowerOfN2(100, 10));
        System.out.println(isPowerOfN2(100, 5));

    }

    // recursive implementation
    public static boolean isPowerOfN(int num, int n) {
        if (num % n != 0 || num == 0) return false;
        if (num == n) return true;
        return isPowerOfN(num/n, n);
    }

    // while loop implementation
    public static boolean isPowerOfN2(int num, int n) {
        while (num % n == 0) {
            num = num / n;
        }
        if (num == 1)
            return true;
        else
            return false;
    }

}
