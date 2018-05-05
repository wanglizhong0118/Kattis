package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/excursion
 * 
 * @author allwi
 *
 */
public class KindergartenExcursion {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] nums = r.readLine().toCharArray();
        int len = nums.length;

        long numberOfOnes = 0;
        long numberOfTwos = 0;
        long swaps = 0;

        // if 0; switch all 1s and 2s before
        // if 1; switch all 2s before
        // if 2; no need to switch
        for (int i = 0; i < len; i++) {
            char current = nums[i];
            if (current == '0') {
                swaps += numberOfOnes;
                swaps += numberOfTwos;
            } else if (current == '1') {
                swaps += numberOfTwos;
                numberOfOnes++;
            } else if (current == '2') {
                numberOfTwos++;
            }
        }
        w.write(String.valueOf(swaps));
        w.flush();
        w.close();
        r.close();
    }
}
