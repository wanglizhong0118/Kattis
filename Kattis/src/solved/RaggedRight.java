package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * https://open.kattis.com/problems/raggedright
 * 
 * @author allwi
 *
 */
public class RaggedRight {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        List<String> ls = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        while ((line = r.readLine()) != null) {
            ls.add(line);
            if (line.length() > max) {
                max = line.length();
            }
        }
        int temp = 0;
        for (int i = 0; i < ls.size() - 1; i++) {
            int d = (int) Math.pow(max - ls.get(i).length(), 2);
            temp += d;
        }
        w.write(String.valueOf(temp));
        w.flush();
        w.close();
        r.close();
    }
}
