package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/encodedmessage
 * 
 * @author allwi
 *
 */
public class EncodedMessage {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {
            String line = r.readLine();
            String[] sts = line.split("");
            int len = (int) Math.sqrt(line.length());
            String[][] stss = new String[len][len];
            for (int j = 0; j < line.length(); j++) {
                stss[j / len][j % len] = sts[j];
            }
            for (int j = len - 1; j >= 0; j--) {
                for (int k = 0; k < len; k++) {
                    w.write(stss[k][j]);
                }
            }
            w.write("\n");
        }
        w.flush();
        w.close();
        r.close();
    }
}
