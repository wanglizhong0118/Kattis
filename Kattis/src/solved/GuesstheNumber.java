package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/guess
 * 
 * @author allwi
 *
 */
public class GuesstheNumber {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int low = 1;
        int high = 1000;
        int mid = 500;

        System.out.println(mid);

        while (true) {
            String line = r.readLine();

            if (line.equals("correct")) {
                break;
            }

            if (line.equals("lower")) {
                high = mid;
                mid = (low + high) / 2;
            }

            if (line.equals("higher")) {
                low = mid;
                mid = (low + high + 1) / 2;
            }

            System.out.println(mid);
        }
    }
}
