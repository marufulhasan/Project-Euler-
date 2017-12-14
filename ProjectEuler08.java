
package projecteuler08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjectEuler08 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\maruf\\Desktop\\eulerDocs\\data08.txt");
        Scanner sc = new Scanner(file);
        ArrayList<Integer> arr = new ArrayList<>();

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                arr.add(s.charAt(i) - '0');
            }
        }
        long globalValue = 1;
        for (int i = 0; i < arr.size() - 12; i++) {

            long localValue = 1;
            for (int j = i; j < i + 13; j++) {
                localValue *= arr.get(j);
            }
            if (globalValue < localValue) {
                globalValue = localValue;
            }
        }
        System.out.println(globalValue);
    }
}

