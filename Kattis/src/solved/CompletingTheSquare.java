package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * https://open.kattis.com/problems/completingthesquare
 * 
 * @author allwi
 *
 */
public class CompletingTheSquare {

    public static void main(String[] args) throws IOException {
        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> ls = new ArrayList<>();
        int count = 3;
        while (count-- > 0) {
            String[] sts = r.readLine().split(" ");
            ls.add(Integer.parseInt(sts[0]));
            ls.add(Integer.parseInt(sts[1]));
        }
        double p1p2 = getDistance(ls.get(0), ls.get(1), ls.get(2), ls.get(3));
        double p1p3 = getDistance(ls.get(0), ls.get(1), ls.get(4), ls.get(5));
        double p2p3 = getDistance(ls.get(2), ls.get(3), ls.get(4), ls.get(5));

        double diagonal = Math.max(p1p2, Math.max(p1p3, p2p3));

        int p4x = 0;
        int p4y = 0;
        if (p1p2 == diagonal) {
            p4x = ls.get(0) + ls.get(2) - ls.get(4);
            p4y = ls.get(1) + ls.get(3) - ls.get(5);
        } else if (p1p3 == diagonal) {
            p4x = ls.get(0) + ls.get(4) - ls.get(2);
            p4y = ls.get(1) + ls.get(5) - ls.get(3);
        } else if (p2p3 == diagonal) {
            p4x = ls.get(2) + ls.get(4) - ls.get(0);
            p4y = ls.get(3) + ls.get(5) - ls.get(1);
        }

        w.write(String.valueOf(p4x) + " " + String.valueOf(p4y));
        w.flush();
        w.close();
        r.close();
    }

    static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

}
