package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * https://open.kattis.com/problems/icpcawards
 * 
 * @author allwi
 *
 */
public class ICPCAwards {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        Map<String, String> temp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] sts = r.readLine().split(" ");
            String key = sts[0];
            String value = sts[1];
            if (temp.get(key) == null) {
                temp.put(key, value);
                w.write(key + " " + value + "\n");
                if (temp.size() == 12) {
                    break;
                }
            }

        }
        w.flush();
        w.close();
        r.close();
    }
}
