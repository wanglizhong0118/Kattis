import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/hissingmicrophone
 * 
 * @author allwi
 *
 */
public class HissingMicrophone {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        while ((line = r.readLine()) != null) {
            if (line.contains("ss")) {
                w.write("hiss\n");
            } else {
                w.write("no hiss\n");
            }
            w.flush();
        }
        w.close();
    }
}
