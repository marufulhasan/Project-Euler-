
package projecteuler12;

public class ProjectEuler12 {

    public static int numDivisor(int n) {
        int result = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                result += 2;
            }
        }
        if (((int) Math.sqrt(n) * (int) Math.sqrt(n)) == n) {
            result--;
        }

        return result;
    }

    public static void main(String[] args) {

        int div = 500;
        int i = 0;
        while (true) {
            i++;
            int temp = (i * (i + 1)) / 2;
            if (numDivisor(temp) >= div) {
                System.out.println(temp);
                break;
            }
        }
    }
}
