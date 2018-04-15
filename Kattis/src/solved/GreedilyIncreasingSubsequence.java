package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * https://open.kattis.com/problems/greedilyincreasing
 * 
 * @author allwi
 *
 */
public class GreedilyIncreasingSubsequence {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        r.readLine();
        String[] sts = r.readLine().split(" ");

        List<Integer> ls = new ArrayList<>();

        int temp = Integer.parseInt(sts[0]);
        ls.add(temp);
        for (int i = 1; i < sts.length; i++) {
            int cur = Integer.parseInt(sts[i]);
            if (cur > temp) {
                ls.add(cur);
                temp = cur;
            }
        }
        w.write(String.valueOf(ls.size()) + "\n");
        for (Integer i : ls) {
            w.write(String.valueOf(i) + " ");
        }
        w.write("\n");
        w.flush();
        w.close();
        r.close();
    }
}
