package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/timeloop
 * 
 * @author allwi
 *
 */
public class StuckInATimeLoop {

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        for (int i = 1; i <= n; i++) {
            w.write(i + " Abracadabra\n");
        }
        w.flush();
        r.close();
        w.close();
    }
}
