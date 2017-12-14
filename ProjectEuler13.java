package projecteuler13;

import java.math.BigInteger;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;

public class ProjectEuler13 {

    public static void main(String[] args) {

        try {
            String temp;
            FileReader file = new FileReader("C:\\Users\\maruf\\Desktop\\books\\data.txt");
            BufferedReader buffer = new BufferedReader(file);
            BigInteger sum = BigInteger.ZERO;

            while ((temp = buffer.readLine()) != null) {

                BigInteger tempBig = new BigInteger(temp);
                sum = sum.add(tempBig);
            }
            System.out.println(sum.toString().substring(0, 10));

        } catch (FileNotFoundException e) {
            System.out.println("file does not exist");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
