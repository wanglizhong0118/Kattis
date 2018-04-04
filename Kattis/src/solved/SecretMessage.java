package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/secretmessage
 * 
 * @author allwi
 *
 */
public class SecretMessage {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {

            String line = r.readLine();
            int len = line.length();
            int k = (int) Math.ceil(Math.sqrt(len));
            char[][] ca = new char[k][k];
            int p = 0;
            for (int j = 0; j < k; j++) {
                for (int m = 0; m < k; m++) {
                    if (p == len) {
                        ca[j][m] = '*';
                    } else {
                        ca[j][m] = line.charAt(p++);
                    }
                }
            }

            for (int j = 0; j < k; j++) {
                for (int m = k - 1; m >= 0; m--) {
                    if (ca[m][j] != '*') {
                        w.write(ca[m][j]);
                    }
                }
            }
            w.write("\n");
        }
        w.flush();
        w.close();
        r.close();
    }

}
