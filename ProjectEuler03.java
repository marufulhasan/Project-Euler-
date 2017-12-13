package projecteuler03;

public class ProjectEuler03 {

    public static void main(String[] args) {

        long num = 600851475143L;

        while (true) {
            long i;
            for (i = 2; i <= num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                System.out.println(num);
                break;
            }
            num /= i;
        }

    }

}
