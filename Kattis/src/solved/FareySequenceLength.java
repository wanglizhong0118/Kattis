package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * https://open.kattis.com/problems/farey
 * 
 * @author allwi
 *
 */
public class FareySequenceLength {

    static int[] fareySeq = new int[10001];

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        buildFareySeq();
        int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer s = new StringTokenizer(r.readLine());
            String caseNr = s.nextToken();
            int request = Integer.parseInt(s.nextToken());
            int len = fareySeq[request];
            w.write(caseNr + " " + String.valueOf(len) + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }

    private static void buildFareySeq() {
        fareySeq[0] = 0;
        fareySeq[1] = 2;
        fareySeq[2] = 3;

        for (int i = 3; i < 10001; i++) {
            fareySeq[i] = fareySeq[i - 1] + phi(i);
        }
    }

    public static int phi(int n) {
        float result = n;
        for (int p = 2; p * p <= n; ++p) {
            if (n % p == 0) {
                while (n % p == 0) {
                    n /= p;
                }
                result *= (1.0 - (1.0 / (float) p));
            }
        }
        if (n > 1) {
            result *= (1.0 - (1.0 / (float) n));
        }
        return (int) result;
    }
}
