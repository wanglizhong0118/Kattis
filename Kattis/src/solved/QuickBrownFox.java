package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

/**
 * https://open.kattis.com/problems/quickbrownfox
 * 
 * @author allwi
 *
 */
public class QuickBrownFox {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {
            Set<Character> alfa = new HashSet<>();
            for (Character ch = 'a'; ch <= 'z'; ch++) {
                alfa.add(ch);
            }
            char[] current = r.readLine().toLowerCase().toCharArray();
            for (Character c : current) {
                alfa.remove(c);
            }

            if (alfa.size() == 0) {
                w.write("pangram\n");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("missing ");
                for (Character c : alfa) {
                    sb.append(c);
                }
                sb.append("\n");
                w.write(sb.toString());
            }
        }
        w.flush();
        w.close();
        r.close();
    }

}
