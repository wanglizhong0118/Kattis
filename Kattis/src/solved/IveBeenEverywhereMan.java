package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author allwi
 *
 */
public class IveBeenEverywhereMan {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final int n = Integer.parseInt(r.readLine());

        int i = 0;
        while (i++ < n) {
            int m = Integer.parseInt(r.readLine());
            Set<String> temp = new HashSet<String>();
            int j = 0;
            while (j++ < m) {
                String s = r.readLine();
                temp.add(s);
            }
            w.write(String.valueOf(temp.size()) + "\n");
        }
        w.flush();
        w.close();
        r.close();

    }

}
