import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/yinyangstones
 * 
 * @author allwi
 *
 */
public class YinAndYangStones {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = r.readLine()) != null) {
            int countW = 0;
            int countB = 0;
            for (char c : line.toCharArray()) {
                if (c == 'W') {
                    countW++;
                } else {
                    countB++;
                }
            }
            if (countW == countB) {
                w.write("1");
            } else {
                w.write("0");
            }
            w.flush();
        }
        w.close();
        r.close();
    }

}
