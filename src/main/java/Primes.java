import java.util.LinkedList;

/**
 * Created by maruf on 1/8/17.
 */
public class Primes {

    public static void main(String[] args) {

        System.out.println(primes(100));

        LinkedList l = new LinkedList<Integer>();
        rPrimes(100, l);
        System.out.println(l);
    }

    /**
     * prime numbers up to n.
     * @param n
     * @return
     */
    public static LinkedList<Integer> primes(Integer n) {
        LinkedList <Integer> l = new LinkedList<Integer>();
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) l.add(i);
        }
        return l;
    }

    private static boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }


    /**
     * prime numbers upto n
     * recursive implementation.
     * @param n
     * @param l
     */

    public static void rPrimes (int n,  LinkedList l) {
        if (n == 1){
            l.add(1);
        } else if (isPrime(n)){
            l.add(n);
        }
        if (n > 1 ) rPrimes(n - 1, l);
    }

}
