
package projecteuler18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProjectEuler18 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\maruf\\Desktop\\eulerDocs\\data18.txt");
        Scanner sc = new Scanner(file);
        int[][] grid = new int[50][50];

        while (sc.hasNextLine()) {

            for (int i = 0; i < 15; i++) {
                for (int j = 0; j <= i; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }
        }

        for (int i = 13; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                grid[i][j] += Math.max(grid[i + 1][j], grid[i + 1][j + 1]);
            }
        }

        System.out.println(grid[0][0]);

    }
}
