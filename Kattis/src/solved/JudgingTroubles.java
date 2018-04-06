package solved;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://open.kattis.com/problems/judging
 * 
 * @author allwi
 *
 */
public class JudgingTroubles {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final int n = Integer.parseInt(r.readLine());

        List<String> dom = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            dom.add(r.readLine());
        }
        Collections.sort(dom);

        List<String> kat = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            kat.add(r.readLine());
        }
        Collections.sort(kat);

        int domp = 0;
        int katp = 0;
        int count = 0;
        while (domp < n && katp < n) {
            final int comp = dom.get(domp).compareTo(kat.get(katp));
            if (comp == 0) {
                domp++;
                katp++;
                count++;
            } else if (comp > 0) {
                katp++;
            } else {
                domp++;
            }
        }
        w.write(String.valueOf(count));
        w.flush();
        w.close();
        r.close();
    }
}
