
  
package projecteuler15;

public class ProjectEuler15 {

    public static void main(String[] args) {
        int grid = 20;
        long[][] gridNum = new long[grid + 1][grid + 1];

        for (int i = 0; i <= grid; i++) {
            gridNum[i][grid] = 1;
        }
        for (int i = 0; i <= grid; i++) {
            gridNum[grid][i] = 1;
        }

        for (int i = grid - 1; i >= 0; i--) {
            for (int j = grid - 1; j >= 0; j--) {

                gridNum[i][j] = gridNum[i + 1][j] + gridNum[i][j + 1];
            }
        }
        System.out.println(gridNum[0][0]);

    }
}


