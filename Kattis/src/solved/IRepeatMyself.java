package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/irepeatmyself
 * 
 * @author allwi
 *
 */
public class IRepeatMyself {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        while (n-- > 0) {
            String line = r.readLine();
            int len = line.length();
            int prefixLen = 0;
            boolean isFound = false;
            for (int prelen = 1; prelen <= len && !isFound; prelen++) {
                String prefix = line.substring(0, prelen);
                for (int start = 0; start <= len; start += prelen) {
                    String cprefix = line.substring(start, Math.min(len, start + prelen));
                    if (!prefix.startsWith(cprefix)) {
                        isFound = false;
                        break;
                    } else {
                        isFound = true;
                        prefixLen = prelen;
                    }
                }
            }
            w.write(String.valueOf(prefixLen) + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }
}
