package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/dicegame
 * 
 * @author allwi
 *
 */
public class DiceGame {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] gunnar = r.readLine().split(" ");
        String[] emma = r.readLine().split(" ");

        int sumgunnar = 0;
        int sumemma = 0;

        for (int i = 0; i < gunnar.length; i++) {
            sumgunnar += Integer.parseInt(gunnar[i]);
        }

        for (int i = 0; i < gunnar.length; i++) {
            sumemma += Integer.parseInt(emma[i]);
        }

        if (sumgunnar > sumemma) {
            w.write("Gunnar");
        } else if (sumgunnar == sumemma) {
            w.write("Tie");
        } else {
            w.write("Emma");
        }
        w.flush();
        w.close();
        r.close();

    }

}
