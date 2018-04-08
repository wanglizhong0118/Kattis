package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/detaileddifferences
 * 
 * @author allwi
 *
 */
public class DetailedDifferences {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {

            final String s1 = r.readLine();
            final String s2 = r.readLine();

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s1.length(); j++) {
                final char c1 = s1.charAt(j);
                final char c2 = s2.charAt(j);
                if (c1 == c2) {
                    sb.append(".");
                } else {
                    sb.append("*");
                }
            }
            w.write(s1 + "\n" + s2 + "\n" + sb.toString() + "\n");
            w.write("\n");
        }
        w.flush();
        w.close();
        r.close();
    }

}
