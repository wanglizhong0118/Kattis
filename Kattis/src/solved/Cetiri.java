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
 * https://open.kattis.com/problems/cetiri
 * 
 * @author allwi
 *
 */
public class Cetiri {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sts = r.readLine().split(" ");

        List<Integer> ls = new ArrayList<>();
        ls.add(Integer.parseInt(sts[0]));
        ls.add(Integer.parseInt(sts[1]));
        ls.add(Integer.parseInt(sts[2]));

        Collections.sort(ls);

        int diff1 = ls.get(1) - ls.get(0);
        int diff2 = ls.get(2) - ls.get(1);

        int temp = -101;

        if (diff1 == diff2) {
            if (ls.get(0) - diff1 < -100) {
                temp = ls.get(2) + diff1;
            } else {
                temp = ls.get(0) - diff1;
            }
        } else if (diff1 > diff2) {
            temp = ls.get(0) + diff2;
        } else {
            temp = ls.get(1) + diff1;
        }
        w.write(String.valueOf(temp));
        w.flush();
        w.close();
        r.close();
    }

}
