package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/deathknight
 * 
 * @author allwi
 *
 */
public class DeathKnightHero {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            String cur = r.readLine();
            if (!cur.contains("CD")) {
                count++;
            }
        }
        w.write(String.valueOf(count));
        w.close();
        r.close();
    }
}
