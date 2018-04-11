package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/savingforretirement
 * 
 * @author allwi
 *
 */
public class SavingForRetirement {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sts = r.readLine().split(" ");

        int b = Integer.parseInt(sts[0]);
        int br = Integer.parseInt(sts[1]);
        int bs = Integer.parseInt(sts[2]);
        int a = Integer.parseInt(sts[3]);
        int as = Integer.parseInt(sts[4]);

        int bt = (br - b) * bs;

        int pos = 0;
        int sum = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += as;
            if (sum > bt) {
                pos = i + 1;
                break;
            }
        }
        w.write(String.valueOf(pos + a));
        w.flush();
        w.close();
        r.close();
    }
}
