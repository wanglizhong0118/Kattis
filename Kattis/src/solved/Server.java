package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/server
 * 
 * @author allwi
 *
 */
public class Server {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] info = r.readLine().split(" ");
        int n = Integer.parseInt(info[0]);
        int time = Integer.parseInt(info[1]);

        String[] sts = r.readLine().split(" ");

        int sum = 0;
        int pos = 0;
        for (int i = 0; i < n; i++) {
            // w.write(String.valueOf(sum) + "\n");
            sum += Integer.parseInt(sts[i]);
            if (sum == time) {
                pos = i + 1;
                break;
            } else if (sum > time) {
                pos = i;
                break;
            }
        }
        if (sum < time) {
            w.write(String.valueOf(n));
        } else {
            w.write(String.valueOf(pos));
        }
        w.flush();
        w.close();
        r.close();
    }

}
