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
 * https://open.kattis.com/problems/drmmessages
 * 
 * @author allwi
 *
 */
public class Kornislav {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        final String[] sts = r.readLine().split(" ");
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < sts.length; i++) {
            ls.add(Integer.parseInt(sts[i]));
        }
        Collections.sort(ls);
        w.write(String.valueOf(ls.get(0) * ls.get(2)));
        w.flush();
        w.close();
        r.close();
    }
}
