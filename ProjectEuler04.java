
package projecteuler04;

public class ProjectEuler04 {

    static boolean isPalindrome(int num) {
        int numStore = num;
        int revNum = 0;
        while (num != 0) {
            revNum = revNum * 10 + num % 10;
            num /= 10;
        }
        return numStore == revNum;
    }
    public static void main(String[] args) {
        int largestPal = 0;
        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                int temp = i * j;
                if (isPalindrome(temp) && temp > largestPal) {
                    largestPal = temp;
                }
            }
        }
        System.out.println(largestPal);
    }
}
