package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * https://open.kattis.com/problems/metaprogramming
 * 
 * @author allwi
 *
 */
public class Metaprogramming {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> map = new HashMap<String, Integer>();

        String line = r.readLine();

        while (line != null) {
            String[] sts = line.split(" ");
            if (sts[0].equals("define")) {
                int value = Integer.parseInt(sts[1]);
                String name = sts[2];
                map.put(name, value);
            } else {
                String first = sts[1];
                String op = sts[2];
                String second = sts[3];
                if (!map.containsKey(first) || !map.containsKey(second)) {
                    w.write("undefined\n");
                } else {
                    int firstv = map.get(first);
                    int secondv = map.get(second);
                    boolean comp = evaluate(firstv, op, secondv);
                    w.write(comp + "\n");
                }
            }
            w.flush();
            line = r.readLine();
        }
    }

    private static boolean evaluate(int firstv, String op, int secondv) {
        boolean eva = false;
        switch (op) {
        case ">":
            eva = firstv > secondv;
            break;
        case "<":
            eva = firstv < secondv;
            break;
        case "=":
            eva = firstv == secondv;
            break;
        default:
            break;
        }
        return eva;
    }
}
