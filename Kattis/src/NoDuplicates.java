import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * https://open.kattis.com/problems/nodup
 * 
 * @author allwi
 *
 */
public class NoDuplicates {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer s = new StringTokenizer(r.readLine());
        Set<String> st = new HashSet<String>();
        boolean success = true;
        while (s.hasMoreTokens()) {
            success = st.add(s.nextToken());
            if (success == false) {
                break;
            }
        }
        if (success) {
            w.write("yes");
        } else {
            w.write("no");
        }
        w.flush();
        w.close();
        r.close();
    }
}
