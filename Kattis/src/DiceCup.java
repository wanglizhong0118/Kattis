import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/dicecup
 * 
 * @author allwi
 *
 */
public class DiceCup {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = r.readLine();
        String sts[] = line.split(" ");

        int N = Integer.parseInt(sts[0]);
        int M = Integer.parseInt(sts[1]);

        if (N >= M) {
            while (N + 1 > M) {
                M++;
                w.write(String.valueOf(M) + "\n");
            }
        } else {
            while (N < M + 1) {
                N++;
                w.write(String.valueOf(N) + "\n");
            }
        }
        w.flush();
        w.close();
        r.close();
    }

}
