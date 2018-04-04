package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * https://open.kattis.com/problems/bookingaroom
 * 
 * @author allwi
 *
 */
public class BookingARoom {
    
    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sts = r.readLine().split(" ");
        int total = Integer.parseInt(sts[0]);
        int booked = Integer.parseInt(sts[1]);
        if (total == booked) {
            w.write("too late");
            w.flush();
            w.close();
            r.close();
        } else {
            List<Integer> ls = new ArrayList<>();
            int i = 0;
            while (i++ < booked) {
                int cur = Integer.parseInt(r.readLine());
                ls.add(cur);
            }
            int j = 0;
            while (j++ < total) {
                if (!ls.contains(j)) {
                    break;
                }
            }
            w.write(String.valueOf(j));
            w.flush();
            w.close();
            r.close();
        }
    }
}
