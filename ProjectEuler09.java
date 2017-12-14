
package projecteuler09;

public class ProjectEuler09 {

    public static void main(String[] args) {
        boolean notFound = true;
        int result09;
        for (int a = 1; a < 1000; a++) {
            for (int b = 1; b < 1000; b++) {
                int c = 1000 - a - b;
                if (a * a + b * b == c * c) {
                    notFound = false;
                    result09 = a * b * c;
                    System.out.println(result09);
                    break;
                }
            }
            if (notFound == false) {
                break;
            }
        }
    }

}
