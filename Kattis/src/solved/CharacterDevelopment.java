package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/character
 * 
 * @author allwi
 *
 */
public class CharacterDevelopment {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        int sum = -1;

        if (n == 0 || n == 1) {
            sum = 0;
        } else {
            sum = (int) (Math.pow(2, n) - n - 1);
        }

        w.write(String.valueOf(sum));
        w.flush();
        w.close();
        r.close();
    }
}
