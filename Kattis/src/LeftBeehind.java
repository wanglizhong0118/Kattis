import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/leftbeehind
 * 
 * @author allwi
 *
 */
public class LeftBeehind {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] line = r.readLine().split(" ");
            int sweet = Integer.parseInt(line[0]);
            int sour = Integer.parseInt(line[1]);
            if (sweet == 0 && sour == 0) {
                break;
            }

            if (sweet > sour && (sweet + sour) != 13 && sweet != sour) {
                w.write("To the convention.\n");
            }
            if (sweet < sour && (sweet + sour) != 13 && sweet != sour) {
                w.write("Left beehind.\n");
            }
            if ((sweet + sour) == 13) {
                w.write("Never speak again.\n");
            }
            if (sweet == sour) {
                w.write("Undecided.\n");
            }
        }
        r.close();
        w.flush();
        w.close();
    }

}
