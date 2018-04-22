package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * https://open.kattis.com/problems/peragrams
 * 
 * @author allwi
 *
 */
public class Peragrams {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = r.readLine();
        char[] chars = line.toCharArray();

        Map<Character, Integer> cmap = new HashMap<>();
        for (Character c : chars) {
            if (cmap.containsKey(c)) {
                int app = cmap.get(c);
                cmap.put(c, app + 1);
            } else {
                cmap.put(c, 1);
            }
        }
        int odd = 0;
        for (Integer i : cmap.values()) {
            if (i % 2 != 0) {
                odd++;
            }
        }
        if (odd == 0 || odd == 1) {
            w.write("0");
        } else {
            w.write(String.valueOf(odd - 1) + "\n");
        }
        w.flush();
        w.close();
        r.close();

    }
}
