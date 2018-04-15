package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/ptice
 * 
 * @author allwi
 *
 */
public class Ptice {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        String line = r.readLine();

        String adrian = "";
        String bruno = "";
        String goran = "";

        while (adrian.length() < n) {
            adrian += "ABC";
        }
        while (bruno.length() < n) {
            bruno += "BABC";
        }
        while (goran.length() < n) {
            goran += "CCAABB";
        }

        int countAdrian = 0;
        int countBruno = 0;
        int countGoran = 0;

        for (int i = 0; i < line.length(); i++) {
            char cur = line.charAt(i);
            if (cur == adrian.charAt(i)) {
                countAdrian++;
            }
            if (cur == bruno.charAt(i)) {
                countBruno++;
            }
            if (cur == goran.charAt(i)) {
                countGoran++;
            }
        }

        int max = Math.max(countAdrian, Math.max(countBruno, countGoran));
        w.write(String.valueOf(max) + "\n");
        if (max == countAdrian) {
            w.write("Adrian\n");
        }
        if (max == countBruno) {
            w.write("Bruno\n");
        }
        if (max == countGoran) {
            w.write("Goran\n");
        }
        w.flush();
        w.close();
        r.close();
    }
}
