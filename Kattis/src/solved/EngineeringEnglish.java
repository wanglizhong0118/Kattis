package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

/**
 * https://open.kattis.com/problems/engineeringenglish
 * 
 * @author allwi
 *
 */
public class EngineeringEnglish {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<String> se = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        String line = r.readLine();

        while (line != null) {
            String[] sts = line.split(" ");
            for (String s : sts) {
                if (se.add(s.toLowerCase())) {
                    sb.append(s).append(" ");
                } else {
                    sb.append(".").append(" ");
                }
            }
            sb.append("\n");
            line = r.readLine();
        }
        w.write(sb.toString());
        w.flush();
        w.close();
        r.close();
    }
}
