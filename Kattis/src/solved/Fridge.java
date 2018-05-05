package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/fridge
 * 
 * @author allwi
 *
 */
public class Fridge {

    public static void main(String[] args) throws IOException {
        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] numberCounts = new int[10];
        char[] nums = r.readLine().toCharArray();
        for (Character c : nums) {
            numberCounts[c - '0'] += 1;
        }
        int currentMinValue = numberCounts[0] + 1;
        int currentMinDigit = 0;
        for (int i = 1; i < numberCounts.length; i++) {
            if (numberCounts[i] < currentMinValue) {
                currentMinValue = numberCounts[i];
                currentMinDigit = i;
            }
        }

        if (currentMinDigit == 0) {
            w.write("1");
            currentMinValue--;
        }
        for (int i = 0; i <= currentMinValue; i++) {
            w.write(String.valueOf(currentMinDigit));
        }
        w.flush();
        w.close();
        r.close();
    }

}
