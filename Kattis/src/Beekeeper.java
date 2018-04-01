import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/beekeeper
 * 
 * @author allwi
 *
 */
public class Beekeeper {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(r.readLine());
            if (n == 0) {
                break;
            }
            int currentMax = 0;
            String currentLine = "";
            for (int i = 0; i < n; i++) {
                String line = r.readLine();
                String fin = line.replace("aa", "").replace("ee", "").replace("ii", "").replace("oo", "")
                        .replace("uu", "").replace("yy", "");
                int count = (line.length() - fin.length()) / 2;
                if (count >= currentMax) {
                    currentMax = count;
                    currentLine = line;
                }
            }
            w.write(currentLine + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }

}
