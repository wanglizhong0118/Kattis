package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

/**
 * https://open.kattis.com/problems/modulo
 * 
 * @author allwi
 *
 */
public class Modulo {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> ls = new HashSet<>();
        String line;

        while ((line = r.readLine()) != null) {
            int n = Integer.parseInt(line);
            ls.add(n % 42);
        }
        w.write(String.valueOf(ls.size()));
        w.flush();
        w.close();
        r.close();
    }
}
