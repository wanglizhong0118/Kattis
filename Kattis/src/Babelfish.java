import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * https://open.kattis.com/problems/redrover
 * 
 * @author allwi
 *
 */
public class Babelfish {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        Map<String, String> words = new HashMap<>();
        while (!(line = r.readLine()).isEmpty()) {
            String[] sts = line.split(" ");
            String key = sts[0];
            String value = sts[1];
            words.put(value, key);
        }

        String line2;
        while ((line2 = r.readLine()) != null) {
            String v = words.get(line2);
            if (v == null) {
                w.write("eh\n");
            } else {
                w.write(v + "\n");
            }
            w.flush();
        }
        w.close();
        r.close();

    }
}
