package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/kemija08
 * 
 * @author allwi
 *
 */
public class Kemija {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = r.readLine();
        s = s.replace("apa", "a").replace("epe", "e").replace("ipi", "i").replace("opo", "o").replace("upu", "u");

        w.write(s);
        w.flush();
        w.close();
        r.close();
    }
}
