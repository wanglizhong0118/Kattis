import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/conundrum
 * 
 * @author allwi
 *
 */
public class CryptographerConundrum {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = r.readLine();
        String temp = "PER";

        int count = 0;

        for (int i = 0; i < line.toCharArray().length; i++) {
            char c = line.charAt(i);
            char s = temp.charAt(i % 3);
            if (c != s) {
                count++;
            }
        }
        w.write(String.valueOf(count));
        w.flush();
        w.close();
        r.close();
    }
}
