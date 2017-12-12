package projecteuler02;

public class ProjectEuler02 {

    public static void main(String[] args) {
        int sum = 2;// will start checking from 3rd fibonacci number;
        int F1 = 1;
        int F2 = 2;
        while (true) {
            int F3 = F1 + F2;
            if (F3 % 2 == 0) {
                sum += F3;
            }
            F1 = F2;
            F2 = F3;
            if (F3 >= 4000000) {
                break;
            }
        }
        System.out.println(sum);
    }
}
