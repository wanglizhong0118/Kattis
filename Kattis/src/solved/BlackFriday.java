package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

/**
 * https://open.kattis.com/problems/blackfriday
 * 
 * @author allwi
 *
 */
public class BlackFriday {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final int n = Integer.parseInt(r.readLine());
        final String[] sts = r.readLine().split(" ");

        HashMap<Integer, Integer> tmp = new HashMap<>();
        HashSet<Integer> duplication = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int key = Integer.parseInt(sts[i]);
            int value = i;
            if (duplication.contains(key)) {
                tmp.remove(key);
            } else {
                tmp.put(key, value);
            }
            duplication.add(key);
        }
        int max = 0;
        int pos = 0;

        for (Entry<Integer, Integer> entry : tmp.entrySet()) {
            int thisKey = entry.getKey();
            int thisValue = entry.getValue();
            if (thisKey > max) {
                max = thisKey;
                pos = thisValue + 1;
            }
        }

        if (max > 0) {
            w.write(String.valueOf(pos));
        } else {
            w.write("none");
        }

        w.flush();
        w.close();
        r.close();
    }

}
