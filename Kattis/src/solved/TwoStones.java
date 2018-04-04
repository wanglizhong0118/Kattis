package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/twostones
 * 
 * @author allwi
 *
 */
public class TwoStones {

    public static void main(String[] args) throws IOException {
        
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        while ((line = r.readLine()) != null) {
            int n = Integer.parseInt(line);
            if (n % 2 == 1) {
                w.write("Alice");
            } else {
                w.write("Bob");
            }
            w.flush();
        }
        r.close();
        w.close();
    }

}
