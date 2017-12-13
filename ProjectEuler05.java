
package projecteuler05;


public class ProjectEuler05 {

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    public static void main(String[] args) {
        int smallestMultiple = 1;
        for (int i = 1; i <= 20; i++) {
            smallestMultiple = lcm(smallestMultiple, i);
        }
        System.out.println(smallestMultiple);

    }
}
