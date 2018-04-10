package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/tritiling
 * 
 * @author allwi
 *
 */
public class TriTiling {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(r.readLine());
            if (n < 0) {
                break;
            } else {
                int[] temp = new int[31];
                temp[0] = 1;
                for (int i = 2; i <= n; i += 2) {
                    temp[i] = temp[i - 2] * 3;
                    for (int j = i - 4; j >= 0; j -= 2) {
                        temp[i] += (temp[j] << 1);
                    }
                }
                int ans = temp[n];
                w.write(String.valueOf(ans) + "\n");
            }
        }
        w.flush();
        w.close();
        r.close();
    }

}
