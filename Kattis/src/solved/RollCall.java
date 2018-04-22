package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 * https://open.kattis.com/problems/rollcall
 * 
 * @author allwi
 *
 */
public class RollCall {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        // fullNames = <lastname, (firstname, firstname ...)>
        Map<String, ArrayList<String>> fullNames = new TreeMap<>();
        Map<String, Integer> firstNames = new HashMap<>();
        String line;
        while ((line = r.readLine()) != null) {
            if (line.equals("")) {
                break;
            }
            StringTokenizer s = new StringTokenizer(line);
            String firstName = s.nextToken();
            String lastName = s.nextToken();
            if (fullNames.containsKey(lastName)) {
                ArrayList<String> fns = fullNames.get(lastName);
                fns.add(firstName);
            } else {
                ArrayList<String> fns = new ArrayList<>();
                fns.add(firstName);
                fullNames.put(lastName, fns);
            }
            if (firstNames.containsKey(firstName)) {
                int occur = firstNames.get(firstName);
                firstNames.put(firstName, occur + 1);
            } else {
                firstNames.put(firstName, 1);
            }
        }

        for (Entry<String, ArrayList<String>> entry : fullNames.entrySet()) {
            String lastName = entry.getKey();
            ArrayList<String> fns = entry.getValue();
            Collections.sort(fns);
            for (String fn : fns) {
                if (firstNames.get(fn) == 1) {
                    w.write(String.valueOf(fn) + "\n");
                } else {
                    w.write(String.valueOf(fn) + " " + String.valueOf(lastName) + "\n");
                }
            }
        }
        w.flush();
        w.close();
        r.close();
    }
}
