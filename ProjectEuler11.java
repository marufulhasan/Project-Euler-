
package projecteuler11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProjectEuler11 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\maruf\\Desktop\\eulerDocs\\data11.txt");
        Scanner sc = new Scanner(file);
        int[][] grid = new int[20][20];

        while (sc.hasNextLine()) {

            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }
        }
        ArrayList<Integer> prod = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (j + 3 < grid.length) {
                    prod.add(grid[j][i] * grid[j + 1][i] * grid[j + 2][i] * grid[j + 3][i]);
                }
                if (i + 3 < grid.length) {
                    prod.add(grid[j][i] * grid[j][i + 1] * grid[j][i + 2] * grid[j][i + 3]);
                }
                if (i + 3 < grid.length && j + 3 < grid.length) {
                    prod.add(grid[j][i] * grid[j + 1][i + 1] * grid[j + 2][i + 2] * grid[j + 3][i + 3]);
                }
                if (j + 3 < grid.length && i >= 3) {
                    prod.add(grid[j][i] * grid[j + 1][i - 1] * grid[j + 2][i - 2] * grid[j + 3][i - 3]);
                }
            }
        }

        System.out.println(Collections.max(prod));

    }
}
