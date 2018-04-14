package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * https://open.kattis.com/problems/zoo
 * 
 * @author allwi
 *
 */
public class UnbearableZoo {

    static SortedMap<String, Integer> map = new TreeMap<>();

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int lc = 1;
        while (true) {
            String line = r.readLine();
            if (line.equals("0")) {
                break;
            }
            w.write("List " + String.valueOf(lc) + ":\n");
            int n = Integer.parseInt(line);
            map.clear();
            for (int i = 0; i < n; i++) {
                String[] sts = r.readLine().split(" ");
                String animal = sts[sts.length - 1].toLowerCase();
                if (map.containsKey(animal)) {
                    int v = map.get(animal);
                    map.put(animal, v + 1);
                } else {
                    map.put(animal, 1);
                }
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String name = entry.getKey();
                int val = entry.getValue();
                w.write(name + " | " + val + "\n");
            }
            lc++;
        }
        w.flush();
        w.close();
        r.close();
    }
}
