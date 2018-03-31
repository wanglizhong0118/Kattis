import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/aaah
 * 
 * @author allwi
 *
 */
public class Aaah {

    public static void main(String[] args) throws IOException {
        
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        String first = r.readLine();
        String second = r.readLine();
        if (first.length() >= second.length()) {
            w.write("go");
        } else {
            w.write("no");
        }
        w.flush();
        w.close();
        r.close();
    }

}
