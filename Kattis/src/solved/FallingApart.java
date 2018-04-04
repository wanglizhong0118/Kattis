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
 * https://open.kattis.com/problems/fallingapart
 * 
 * @author allwi
 *
 */
public class FallingApart {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        int a = 0;
        int b = 0;

        String[] sts = r.readLine().split(" ");
        List<Integer> ls = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            ls.add(Integer.parseInt(sts[i]));
        }
        Collections.sort(ls);
        Collections.reverse(ls);
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a += ls.get(i);
            } else {
                b += ls.get(i);
            }
        }

        w.write(String.valueOf(a) + " " + String.valueOf(b));
        w.flush();
        w.close();
        r.close();
    }

}
