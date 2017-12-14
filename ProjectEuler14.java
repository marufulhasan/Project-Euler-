package projecteuler14;

public class ProjectEuler14 {

    public static int collatzL(long n) {
        int count = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            count++;

        }
        return count + 1;
    }

    public static void main(String[] args) {
        int i;
        int max = 0;
        int largestNumber = 0;
        for (i = 1; i <= 1000000; i++) {

            int temp = collatzL(i);
            if (temp > max) {
                max = temp;
                largestNumber = i;
            }
        }
        System.out.println(largestNumber);
    }

}
