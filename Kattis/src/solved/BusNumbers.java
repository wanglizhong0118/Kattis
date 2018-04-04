package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * https://open.kattis.com/problems/busnumbers
 * 
 * @author allwi
 *
 */
public class BusNumbers {

    public static void main(String[] args) throws IOException {
        
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        while ((r.readLine()) != null) {
            List<Integer> lis = new ArrayList<>();
            StringTokenizer s = new StringTokenizer(r.readLine());
            while (s.hasMoreTokens()) {
                lis.add(Integer.parseInt(s.nextToken()));
            }
            Collections.sort(lis);

            StringBuilder sb = new StringBuilder();
            int last;
            for (int i = 0; i < lis.size();) {
                int current = lis.get(i);
                last = current;
                while (++i < lis.size() && lis.get(i) == last + 1) {
                    last = lis.get(i);
                }
                if (current == last) {
                    sb.append(current).append(" ");
                } else if (current == last - 1) {
                    sb.append(current).append(" ");
                    sb.append(last).append(" ");
                } else {
                    sb.append(current).append("-").append(last).append(" ");
                }
            }
            w.write(sb.toString());
            w.flush();
        }
        w.close();
        r.close();
    }

}
