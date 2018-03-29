import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/3dprinter
 * 
 * @author allwi
 *
 */
public class ThreeDPrintedStatues {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int stats = Integer.parseInt(r.readLine());
        int days = 1;
        int prints = 1;
        while (stats > prints) {
            prints = prints * 2;
            days++;
        }
        w.write(String.valueOf(days));
        w.flush();
        w.close();
        r.close();
    }
}
