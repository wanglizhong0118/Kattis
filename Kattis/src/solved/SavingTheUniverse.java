package solved;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

/**
 * https://open.kattis.com/problems/savinguniverse
 * 
 * @author allwi
 *
 */
public class SavingTheUniverse {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final int cases = Integer.parseInt(r.readLine());

        for (int i = 0; i < cases; i++) {
            int sw = 0;
            int engines = Integer.parseInt(r.readLine());
            for (int e = 0; e < engines; e++) {
                r.readLine();
            }
            int queries = Integer.parseInt(r.readLine());
            Set<String> temp = new HashSet<String>();
            for (int q = 0; q < queries; q++) {
                String st = r.readLine();
                temp.add(st);
                // all possible engines are used
                if (engines == temp.size()) {
                    temp.clear();
                    temp.add(st);
                    sw++;
                }

            }
            int c = i + 1;
            w.write("case #" + String.valueOf(c) + ": " + sw + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }
}
