package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/simonsays
 * 
 * @author allwi
 *
 */
public class SimonSays2 {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        for (int i = 0; i < n; i++) {
            String[] sts = r.readLine().split(" ");
            if (sts[0].equals("Simon") && sts[1].equals("says")) {
                StringBuilder sb = new StringBuilder();
                for (int j = 2; j < sts.length; j++) {
                    sb.append(sts[j] + " ");
                }
                w.write(sb.toString() + "\n");
            }
        }
        w.flush();
        w.close();
        r.close();
    }

}
