package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * https://open.kattis.com/problems/simplicity
 * 
 * @author allwi
 *
 */
public class Simplicity {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = r.readLine();
        int[] alfs = new int[26];

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            int diff = c - 'a';
            if (alfs[diff] != 0) {
                alfs[diff] += 1;
            } else {
                alfs[c - 'a'] = 1;
            }
        }

        Arrays.sort(alfs);

        int re = 0;
        for (int i = 0; i < alfs.length - 2; i++) {
            re += alfs[i];
        }

        w.write(String.valueOf(re));

        w.flush();
        w.close();
        r.close();
    }

}
