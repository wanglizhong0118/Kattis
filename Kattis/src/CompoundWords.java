import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 * https://open.kattis.com/problems/compoundwords
 * 
 * @author allwi
 *
 */
public class CompoundWords {

    public static void main(String[] args) throws IOException {
        
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = "";
        List<String> al = new ArrayList<String>();
        while ((line = r.readLine()) != null) {
            StringTokenizer s = new StringTokenizer(line);
            while (s.hasMoreTokens()) {
                al.add(s.nextToken());
            }
        }
        r.close();

        TreeSet<String> ts = new TreeSet<>();
        for (int i = 0; i < al.size(); i++) {
            for (int j = 0; j < al.size(); j++) {
                if (i == j)
                    continue;
                ts.add(al.get(i) + al.get(j));
            }
        }

        for (final String st : ts) {
            w.write(st + "\n");
        }

        w.flush();
        w.close();
        r.close();
    }
}
