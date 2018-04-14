package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/hangingout
 * 
 * @author allwi
 *
 */
public class HangingOutontheTerrace {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sts = r.readLine().split(" ");
        int l = Integer.parseInt(sts[0]);
        int x = Integer.parseInt(sts[1]);
        int in = 0;
        int go = 0;
        for (int i = 0; i < x; i++) {
            String line = r.readLine();
            String[] stst = line.split(" ");
            String sta = stst[0];
            int num = Integer.parseInt(stst[1]);
            if (sta.equals("enter") && in + num <= l) {
                in += num;
            } else if (sta.equals("enter") && in + num > l) {
                go++;
            } else {
                in -= num;
            }
        }
        w.write(String.valueOf(go));
        w.flush();
        w.close();
        r.close();
    }
}
