
package projecteuler10;



import java.util.ArrayList;
import java.util.Arrays;
import java.math.BigInteger;

public class ProjectEuler10 {

    public static ArrayList<Integer> primes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i; j * i <= n; j++) {
                    isPrime[i * j] = false;
                }
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        ArrayList<Integer> primesNow = primes(2000000);
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < primesNow.size(); i++) {
            sum = sum.add(BigInteger.valueOf(primesNow.get(i)));
        }

        System.out.println(sum);
    }

}
