
package projecteuler16;
import java.math.BigInteger;

public class ProjectEuler16 {

    public static void main(String[] args) {

        String s = BigInteger.valueOf(2).pow(1000).toString();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        System.out.println(sum);
    }

}
