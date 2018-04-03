import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/quickestimate
 * 
 * @author allwi
 *
 */
public class QuickEstimates {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        int i = 0;
        while (i++ < n) {
            w.write(String.valueOf(r.readLine().length() + "\n"));
        }
        w.flush();
        w.close();
        r.close();
    }

}
