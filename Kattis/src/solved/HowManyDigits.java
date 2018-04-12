package solved;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * https://open.kattis.com/problems/howmanydigits
 * 
 * @author allwi
 *
 */
public class HowManyDigits {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Double> temp = new ArrayList<>();
        temp.add((double) 0);
        temp.add(Math.log10(1));
        for (int i = 2; i <= 1000000; i++) {
            temp.add(Math.log10(i) + temp.get(i - 1));

        }

        String line = r.readLine();

        while (line != null) {
            int n = Integer.parseInt(line);
            int digs = (int) Math.floor(temp.get(n)) + 1;
            w.write(String.valueOf(digs) + "\n");
            w.flush();
            line = r.readLine();
        }
        w.close();
        r.close();
    }
}
