package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/r2
 * 
 * @author allwi
 *
 */
public class R2 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = r.readLine().split(" ");

        int n = Integer.parseInt(strs[1]) * 2 - Integer.parseInt(strs[0]);

        w.write(Integer.toString(n));

        w.flush();
        w.close();
        r.close();
    }

}
