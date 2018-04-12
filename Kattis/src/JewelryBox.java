import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/jewelrybox
 * 
 * @author allwi
 *
 */
public class JewelryBox {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {
            String[] sts = r.readLine().split(" ");
            double x = Double.parseDouble(sts[0]);
            double y = Double.parseDouble(sts[1]);
            
        }
    }
}
