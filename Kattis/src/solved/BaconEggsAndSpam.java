package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * https://open.kattis.com/problems/baconeggsandspam
 * 
 * @author allwi
 *
 */
public class BaconEggsAndSpam {

    static SortedMap<String, List<String>> map = new TreeMap<>();

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            map.clear();
            String line = r.readLine();
            if (line.equals("0")) {
                break;
            }
            int n = Integer.parseInt(line);
            for (int i = 0; i < n; i++) {
                String[] sts = r.readLine().split(" ");
                String name = sts[0];
                for (int j = 1; j < sts.length; j++) {
                    String curfood = sts[j];
                    List<String> ls;
                    if (map.containsKey(curfood)) {
                        ls = map.get(curfood);
                    } else {
                        ls = new ArrayList<>();
                    }
                    ls.add(name);
                    map.put(curfood, ls);
                }
            }

            for (Entry<String, List<String>> entry : map.entrySet()) {
                String food = entry.getKey();
                w.write(food + " ");
                List<String> ls = entry.getValue();
                Collections.sort(ls);
                for (String s : ls) {
                    w.write(s + " ");
                }
                w.write("\n");
            }
            w.write("\n");
        }
        w.flush();
        w.close();
        r.close();
    }
}
