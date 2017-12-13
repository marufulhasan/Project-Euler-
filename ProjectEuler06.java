
package projecteuler06;


public class ProjectEuler06 {

    public static void main(String[] args) {

        int n = 100;
        int sumSquareDifference;

        sumSquareDifference = n * n * (n + 1) * (n + 1) / 4 - n * (n + 1) * (2 * n + 1) / 6;
        System.out.println(sumSquareDifference);
    }

}
