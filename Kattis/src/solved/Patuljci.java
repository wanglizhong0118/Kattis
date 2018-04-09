package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * https://open.kattis.com/problems/patuljci
 * 
 * @author allwi
 *
 */
public class Patuljci {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> ls = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int cur = Integer.parseInt(r.readLine());
            ls.add(cur);
            sum += cur;
        }

        int diff = sum - 100;
        int a = 0;
        int b = 0;

        for (int i = 0; i < ls.size(); i++) {
            int temp1 = ls.get(i);
            for (int j = 0; j < ls.size(); j++) {
                int temp2 = ls.get(j);
                if (i != j && temp1 + temp2 == diff) {
                    a = ls.get(i);
                    b = ls.get(j);
                    break;
                }
            }
        }

        for (int i = 0; i < ls.size(); i++) {
            int cur = ls.get(i);
            if (cur != a && cur != b) {
                w.write(String.valueOf(ls.get(i)) + "\n");
            }
        }
        w.flush();
        w.close();
        r.close();
    }

}
