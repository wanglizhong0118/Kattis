package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.TreeMap;

/**
 * https://open.kattis.com/problems/cups
 * 
 * @author allwi
 *
 */
public class StackingCups {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        Map<Integer, String> temp = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] sts = r.readLine().split(" ");
            if (Character.isDigit(sts[0].charAt(0))) {
                temp.put(Integer.parseInt(sts[0]), sts[1]);
            } else {
                temp.put(Integer.parseInt(sts[1]) * 2, sts[0]);
            }
        }
        temp.values().forEach(s -> {
            try {
                w.write(s + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        w.flush();
        w.close();
        r.close();
    }
}
